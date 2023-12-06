
public class PagIbigOffice {
    public static void main(String[] args) {
        QueueSystem centralizedQueueSystem = new QueueSystem();

        HelpDesk helpDesk1 = new HelpDesk(centralizedQueueSystem);
        HelpDesk helpDesk2 = new HelpDesk(centralizedQueueSystem);
        HelpDesk helpDesk3 = new HelpDesk(centralizedQueueSystem);

        OnlineMonitoringSystem monitoringSystem = new OnlineMonitoringSystem(centralizedQueueSystem);


        centralizedQueueSystem.enqueue(1);
        centralizedQueueSystem.enqueue(2);
        centralizedQueueSystem.enqueue(3);

        helpDesk1.resetQueueNumber(1);

        monitoringSystem.displayCurrentQueueNumber();

        helpDesk1.serveNextCustomer();
        helpDesk2.serveNextCustomer();
        helpDesk3.serveNextCustomer();



    }
}
