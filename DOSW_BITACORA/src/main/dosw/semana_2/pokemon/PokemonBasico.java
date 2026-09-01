package dosw.semana_2.pokemon;

/**
 * Clase auxiliar liviana para los niveles 1 y 2 (antes de introducir la
 * clase Pokemon completa que exige el taller a partir del Nivel 3).
 */
public class PokemonBasico {
    private final String nombre;
    private final String tipo;
    private final int nivel;
    private final boolean puedeEvolucionar;

    public PokemonBasico(String nombre, String tipo, int nivel, boolean puedeEvolucionar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puedeEvolucionar = puedeEvolucionar;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNivel() { return nivel; }
    public boolean isPuedeEvolucionar() { return puedeEvolucionar; }

    @Override
    public String toString() {
        return nombre + "(" + tipo + ", nivel " + nivel + ")";
    }
}
