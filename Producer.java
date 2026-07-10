class Producer {

    private final Broker broker;
    private final String producerId;

    public Producer(Broker broker) {
        this.broker = broker;
    }

    public void send(String topic, String message) {
        broker.publish(topic, message);
    }
}
