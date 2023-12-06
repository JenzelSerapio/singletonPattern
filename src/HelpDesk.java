public class HelpDesk {

    private QueueSystem queueSystem;

    public HelpDesk(QueueSystem queueSystem) {
        this.queueSystem = queueSystem;
    }

    public void serveNextCustomer() {
        try {
            int nextCustomer = queueSystem.dequeue();
            System.out.println("Serving customer with queue number: " + nextCustomer);
        } catch (IllegalStateException e) {
            System.out.println("No customers in the queue");
        }
    }

    public void resetQueueNumber(int newNumber) {
        queueSystem.resetQueue(newNumber);
    }
}
