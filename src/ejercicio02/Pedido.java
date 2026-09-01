package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final String id;
    private final List<NotificationObserver> observers = new ArrayList<>();

    public Pedido(String id) {
        this.id = id;
    }

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void cambiarEstado(String nuevoEstado) {
        OrderEvent event = new OrderEvent(id, nuevoEstado);
        for (NotificationObserver o : observers) {
            o.notify(event);
        }
    }
}
