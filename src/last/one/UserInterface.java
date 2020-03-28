package last.one;

import com.intellij.sisyphus.api.User;

import java.util.Scanner;

public class UserInterface {
    private static Scanner keyboard = null;
    private int selection;
    private static UserInterface instance = null;
    TicketTracker tTrack = new TicketTracker();
    Time time = new Time();

    public UserInterface() {
        keyboard = new Scanner(System.in);
    }

    TicketDB ticketDB = new TicketDB();
    Ticket ticket = new Ticket() {
        @Override
        public int getLostTicketCost() {
            return super.getLostTicketCost();
        }

        @Override
        public int getRegularTicketCost() {
            return super.getRegularTicketCost();
        }
    };

    public void displayParkingGarageTitle() {
        System.out.println("Best Value Parking Garage\n =====================");
    }

    public void displayEnterMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/In");
        System.out.println("2 - Check/Out");
        System.out.println("3 - Close Garage");

    }


    public void exitProgram() {
        displayParkingGarageTitle();
        System.out.println("Activity to Date");
        System.out.println(" was collected from " + " Check ins");
        System.out.println(" was collected from " + " Lost Tickets");
        System.out.println(" was collected overall");
    }

    public void regularTicket() {
        displayParkingGarageTitle();
        System.out.println("Receipt for a vehicle ID " + tTrack.getTicketID());
        //add in range of hours parked + total hours parked
        System.out.println(" hours parked ");
        //Display total cost of ticket
        System.out.println();

    }

    public void lostTicket() {
        displayParkingGarageTitle();
        System.out.println("Receipt for vehicle ID: ");
        System.out.println("Lost Ticket");
        System.out.println("$" + ticket.getLostTicketCost());
    }

    public void displayExitingMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        String selection = keyboard.nextLine();

        System.out.println();
        System.out.println();


    }

    public void checkIn() {
        System.out.println("Ticket ID: " + tTrack.setTicketID());
        System.out.println("Time in: " + tTrack.getTime());
    }

    public static UserInterface getUserInterface() {
        if (instance == null){
            instance = new UserInterface();
        }
        return instance;
    }

    public char getMenu() {
        System.out.println("Please Enter Choice: ");
        String temp = keyboard.nextLine();
        return temp.charAt(0);
    }

    public void checkOut() {
    }
}
