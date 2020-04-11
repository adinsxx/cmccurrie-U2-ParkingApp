package last.one;

public class TicketTracker {
    private int ticketID;
    private Time time = new Time();

    public int getTicketID() {
        return ticketID;
    }

    public int setTicketID() {
        ticketID++;
        return this.ticketID = ticketID;
    }

    public int getTime() {
        return time.getTimeIn();
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
