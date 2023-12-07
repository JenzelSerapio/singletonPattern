public class HelpDesk {

    private static HelpDesk instance;
    private int currentQueueNumber;

    private HelpDesk() {

        this.currentQueueNumber = 1;
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }
    public static HelpDesk getInstance() {
        if (instance == null) {
            instance = new HelpDesk();
        }
        return instance;
    }

    public void reset(int newQueueNumber) {
        System.out.println("We are resetting the queue number to: " + newQueueNumber);
        currentQueueNumber = newQueueNumber;
    }
    public void nextCustomer() {
        System.out.println("The helpdesk is now processing customer with queue number: " + currentQueueNumber);
        currentQueueNumber++;
    }

}
