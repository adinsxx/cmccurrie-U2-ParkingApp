package last.one;

public class RegularTicket extends Ticket {
    private int regularTicketCost;

    public RegularTicket(int lostTicketCost, int regularTicketCost) {
        super(lostTicketCost, regularTicketCost);
    }


    public void getRegularTicketCost(int regularTicketCost) {
        Time ticketTime = new Time();
        int timeParked = ticketTime.getTimeIn() - ticketTime.getTimeOut();
        if (timeParked < 3) {
            this.regularTicketCost = 5;
        } else if (timeParked > 3) {
            this.regularTicketCost = 5 + (timeParked - 3);
        }
    }
    @Override
    public String toString(){return "Lost ticket cost: $" + regularTicketCost;}
}
