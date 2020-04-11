package last.one;

public class Ticket {
    int lostTicketCost;
    int regularTicketCost;
    Time ticketTime = new Time();


    public Ticket(int lostTicketCost, int regularTicketCost) {
        this.lostTicketCost = lostTicketCost;
        this.regularTicketCost = regularTicketCost;
    }

    public int getLostTicketCost() {
        return lostTicketCost;
    }

    public int getRegularTicketCost() {
        return regularTicketCost;
    }
}

