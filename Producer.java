class Producer {

    private final Broker broker;
    private final String producerId;

    public Producer(String producerId,Broker broker) {
        this.producerId = producerId;
        this.broker = broker;
    }

    public void send(String topic, String message) {
        broker.publish(topic, message,producerId);
    }
}
