package last.one;

import java.util.ArrayList;

public class TicketDB {
    private ArrayList<Ticket> tickets;

    public TicketDB() {
        tickets = new ArrayList<>();
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
