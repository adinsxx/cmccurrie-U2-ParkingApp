package last.one;

public class LostTicket extends Ticket {
    private int lostTicketCost;

    public LostTicket(int lostTicketCost, int regularTicketCost) {
        super(lostTicketCost, regularTicketCost);
    }

    public void getLostTicketCost(int lostTicketCost) {
        this.lostTicketCost = 25;
    }

    @Override
    public String toString(){return "Lost ticket: $" + lostTicketCost;}
}
