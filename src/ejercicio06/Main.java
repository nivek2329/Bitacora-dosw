package ejercicio06;

/**
 * Demostracion: Strategy + Observer.
 * Strategy responde "como recomendar" (por genero, historial, popularidad).
 * Observer responde "a quien avisar" cuando el usuario cambia de estrategia,
 * disparando la actualizacion de los componentes de la UI.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Kevin");
        RecommendationEngine engine = new RecommendationEngine();
        engine.addObserver(new HomePageComponent());
        engine.addObserver(new NotificationService());
        engine.addObserver(new SuggestedListComponent());

        engine.cambiarPreferencia(user, new GenreStrategy());
        System.out.println("Recomendaciones: " + engine.obtenerRecomendaciones(user));

        System.out.println();
        engine.cambiarPreferencia(user, new SimilarityStrategy());
        System.out.println("Recomendaciones: " + engine.obtenerRecomendaciones(user));
    }
}
