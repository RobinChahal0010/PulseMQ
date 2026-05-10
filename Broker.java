import java.util.*;
import java.util.concurrent.*;

class Broker {

    private final Map<String, BlockingQueue<Message>> topics = new ConcurrentHashMap<>();

    // CREATE TOPIC
    public void createTopic(String topicName) {
        topics.putIfAbsent(topicName, new LinkedBlockingQueue<>());
System.out.println("[TOPIC CREATED] " + topicName);    }

    // PUBLISH MESSAGE
    public void publish(String topic, String content) {

        BlockingQueue<Message> queue = topics.get(topic);

        if (queue == null) {
System.out.println("[ERROR] Topic does not exist.");            return;
        }

        Message message = new Message(topic, content);

        try {
            queue.put(message);
System.out.println("[PUBLISHED] " + message);        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // GET QUEUE
    public BlockingQueue<Message> getTopicQueue(String topic) {
        return topics.get(topic);
    }
}