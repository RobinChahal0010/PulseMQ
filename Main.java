import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Broker broker = new Broker();

        Producer producer = new Producer(broker);

        while (true) {

            System.out.println("\n===== MINI KAFKA =====");
            System.out.println("1. Create Topic");
            System.out.println("2. Start Consumer");
            System.out.println("3. Publish Message");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Topic Name: ");
                    String topic = sc.nextLine();

                    broker.createTopic(topic);

                    break;

                case 2:

                    System.out.print("Enter Topic Name: ");
                    String consumerTopic = sc.nextLine();

                    System.out.print("Enter Consumer Name: ");
                    String consumerName = sc.nextLine();

                    Consumer consumer =
                            new Consumer(
                                    consumerName,
                                    broker.getTopicQueue(consumerTopic)
                            );

                    Thread consumerThread = new Thread(consumer);

                    consumerThread.start();

                    System.out.println("[CONSUMER STARTED]");

                    break;

                case 3:

                    System.out.print("Enter Topic Name: ");
                    String publishTopic = sc.nextLine();

                    System.out.print("Enter Message: ");
                    String message = sc.nextLine();

                    producer.send(publishTopic, message);

                    break;

                case 4:

                    System.out.println("Exiting Mini Kafka...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}