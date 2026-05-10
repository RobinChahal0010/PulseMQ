class Producer {

    private final Broker broker;

    public Producer(Broker broker) {
        this.broker = broker;
    }

    public void send(String topic, String message) {
        broker.publish(topic, message);
    }
}