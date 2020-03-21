package last.one;

public abstract class Ticket {
    int lostTicketCost;
    int regularTicketCost;
    Time ticketTime = new Time();


    public Ticket(int lostTicketCost, int regularTicketCost) {
        this.lostTicketCost = lostTicketCost;
        this.regularTicketCost = regularTicketCost;
    }

    protected Ticket() {
    }

    public int getLostTicketCost() {
        return lostTicketCost;
    }

    public int getRegularTicketCost() {
        return regularTicketCost;
    }
}

