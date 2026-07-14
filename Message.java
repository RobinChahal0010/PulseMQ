import java.util.*;
import java.util.concurrent.*;

// MESSAGE CLASS
class Message {
    private final String topic;
    private final String content;
    private final long timestamp;
    private final long offset;
    private final String producerId;

    public Message(long offset,String topic, String content,String producerId) {
        this.topic = topic;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
        this.producerId = producerId;
        this.offset = offset;
        
    }
    public long getOffset()

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
