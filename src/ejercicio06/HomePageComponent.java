package ejercicio06;

public class HomePageComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("[HomePage] Re-renderizando pagina principal para " + user.getNombre());
    }
}
