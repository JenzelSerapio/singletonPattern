public class PagIbigOffice {
    public static void main(String[] args) {
        HelpDesk station = HelpDesk.getInstance();

        station.nextCustomer();
        station.nextCustomer();
        station.nextCustomer();

        int currentQueueNumber = station.getCurrentQueueNumber();
        System.out.println("CURRENT queue number: " + currentQueueNumber);

        station.reset(5);

        station.nextCustomer();
        station.nextCustomer();
        station.nextCustomer();

        currentQueueNumber = station.getCurrentQueueNumber();
        System.out.println("UPDATED queue number: " + currentQueueNumber);
        
    }
}
