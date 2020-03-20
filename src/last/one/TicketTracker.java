package last.one;

public class TicketTracker {
    private int ticketID = 0;
    private Time time = new Time();

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        ticketID++;
        this.ticketID = ticketID;
    }

    public int getTime() {
        return time.getTimeIn();
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
