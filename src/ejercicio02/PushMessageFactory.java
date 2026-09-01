package ejercicio02;

public class PushMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        String json = "{\"orderId\":\"" + event.getOrderId()
                + "\",\"status\":\"" + event.getStatus() + "\"}";
        return new Message(json);
    }
}
