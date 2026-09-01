package ejercicio06;

import java.util.List;

public class PopularityStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Lo mas visto esta semana"));
    }
}
