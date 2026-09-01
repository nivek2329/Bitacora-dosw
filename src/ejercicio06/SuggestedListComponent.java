package ejercicio06;

public class SuggestedListComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("[Sugeridos] Actualizando lista de sugeridos de " + user.getNombre());
    }
}
