import java.util.concurrent.*;


class Consumer implements Runnable {

    private final String consumerName;
    private final BlockingQueue<Message> queue;

    public Consumer(String consumerName, BlockingQueue<Message> queue) {
        this.consumerName = consumerName;
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {

                Message message = queue.take();

                System.out.println(
                       "[CONSUMED BY " + consumerName + "] -> " + message
                );

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}