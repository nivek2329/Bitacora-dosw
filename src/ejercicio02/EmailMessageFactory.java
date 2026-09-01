package ejercicio02;

public class EmailMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        String html = "<html><body>Tu pedido " + event.getOrderId()
                + " ahora esta: <b>" + event.getStatus() + "</b></body></html>";
        return new Message(html);
    }
}
