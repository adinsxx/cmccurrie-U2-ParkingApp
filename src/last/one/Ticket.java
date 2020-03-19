package last.one;

public class Ticket {
    int lostTicketCost;
    int regularTicketCost;

    public Ticket(int lostTicketCost, int regularTicketCost) {
        this.lostTicketCost = lostTicketCost;
        this.regularTicketCost = regularTicketCost;
    }

    public void setLostTicketCost(int lostTicketCost) {
        this.lostTicketCost = 25;
    }

    public void getRegularTicketCost(int regularTicketCost){
        Time time = new Time();
        int timeParked = time.getTimeIn() - time.getTimeOut();
        if (timeParked < 3){
            this.regularTicketCost = 5;
        } else if (timeParked > 3){
            this.regularTicketCost=  5 + (timeParked - 3);
        } else if (timeParked <= 24){
            this.regularTicketCost = 15;
        }
    }
}
