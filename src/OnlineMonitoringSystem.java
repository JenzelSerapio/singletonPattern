public class OnlineMonitoringSystem {

    private QueueSystem queueSystem;

    public OnlineMonitoringSystem(QueueSystem queueSystem) {
        this.queueSystem = queueSystem;
    }

    public void displayCurrentQueueNumber() {
        try {
            int currentQueueNumber = queueSystem.getCurrentQueueNumber();
            System.out.println("Current Queue Number: " + currentQueueNumber);
        } catch (IllegalStateException e) {
            System.out.println("Queue is empty");
        }
    }
    }


