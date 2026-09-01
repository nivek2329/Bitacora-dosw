package ejercicio06;

public class NotificationService implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("[Notificaciones] Enviando push de nuevas recomendaciones a " + user.getNombre());
    }
}
