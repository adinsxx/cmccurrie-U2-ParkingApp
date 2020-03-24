package last.one;

import java.util.Scanner;

public class UserInterface {
    private static Scanner keyboard = null;
    private int selection;
    TicketTracker car = new TicketTracker();
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
        System.out.println("3 - Close Garage");
        keyboard.nextInt();
        System.out.println();
        System.out.println();
        if (selection == 1){
            time.getTimeIn();
        }
        else if (selection == 3){
            exitProgram();
        }
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
        System.out.println("Receipt for a vehicle ID " + car.getTicketID());
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

    private void standardTicket() {
    }

}
