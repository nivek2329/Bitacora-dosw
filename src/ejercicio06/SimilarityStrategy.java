package ejercicio06;

import java.util.List;

public class SimilarityStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Usuarios similares a " + user.getNombre() + " tambien vieron..."));
    }
}
