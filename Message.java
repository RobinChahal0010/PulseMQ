import java.util.*;
import java.util.concurrent.*;

// MESSAGE CLASS
class Message {
    private final String topic;
    private final String content;
    private final long timestamp;

    public Message(String topic, String content) {
        this.topic = topic;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public String getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + topic.toUpperCase() + "] "
                + content
                + " | Time: " + timestamp;
    }
}