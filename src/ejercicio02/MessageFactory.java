package ejercicio02;

public interface MessageFactory {
    Message build(OrderEvent event);
}
