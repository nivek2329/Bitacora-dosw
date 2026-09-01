package ejercicio06;

import java.util.List;

public class GenreStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Accion: Duro de Matar"), new Content("Accion: Mad Max"));
    }
}
