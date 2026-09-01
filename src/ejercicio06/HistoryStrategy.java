package ejercicio06;

import java.util.List;

public class HistoryStrategy implements RecommendationAlgorithm {
    @Override
    public List<Content> recommend(User user) {
        return List.of(new Content("Similar a lo que " + user.getNombre() + " ya vio"));
    }
}
