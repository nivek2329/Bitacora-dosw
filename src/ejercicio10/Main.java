package ejercicio10;

/**
 * Demostracion: Decorator + Command.
 * Decorator aplica filtros de forma acumulativa envolviendo la imagen base
 * en cualquier orden, sin modificar la clase original.
 * Command encapsula cada operacion del usuario permitiendo deshacer
 * individualmente cualquier paso del historial, no solo el ultimo global.
 */
public class Main {
    public static void main(String[] args) {
        Image base = new BaseImage("foto.jpg");
        ImageEditor editor = new ImageEditor(base);

        editor.ejecutar(new ApplyFilterCommand(editor, SepiaDecorator::new));
        editor.ejecutar(new ApplyFilterCommand(editor, BrightnessDecorator::new));
        editor.ejecutar(new ApplyFilterCommand(editor, GrayscaleDecorator::new));

        System.out.println("Resultado final: " + editor.getImage().render());

        System.out.println("\n--- Deshaciendo la ultima operacion ---");
        editor.deshacerUltimo();
        System.out.println("Estado actual: " + editor.getImage().render());
    }
}
