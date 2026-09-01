package ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {
    private RecommendationAlgorithm algorithm;
    private final List<PreferenceObserver> observers = new ArrayList<>();

    public void addObserver(PreferenceObserver observer) {
        observers.add(observer);
    }

    // Cambiar el algoritmo dispara el aviso a todos los observers.
    public void cambiarPreferencia(User user, RecommendationAlgorithm nuevoAlgoritmo) {
        this.algorithm = nuevoAlgoritmo;
        System.out.println(">> Preferencia cambiada a: " + nuevoAlgoritmo.getClass().getSimpleName());
        for (PreferenceObserver o : observers) {
            o.onPreferenceChanged(user);
        }
    }

    public List<Content> obtenerRecomendaciones(User user) {
        return algorithm.recommend(user);
    }
}
