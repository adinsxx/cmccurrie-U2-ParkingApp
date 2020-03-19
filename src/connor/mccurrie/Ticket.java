package connor.mccurrie;

import java.util.ArrayList;

public class Ticket {
    private ArrayList<Ticket> tickets;
    public Ticket() {
        tickets = new ArrayList<>();
    }

    public ArrayList<Ticket> getTickets(){
        return tickets;
    }

}
