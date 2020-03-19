package last.one;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {
    private TicketDB ticketDB = new TicketDB();
    private Scanner keyboard;

    public void displayParkingGarageTitle() {
        System.out.println("Best Value Parking Garage\n\n =====================");
    }

    private void displayEnterMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/In");
        System.out.println("3 - Close Garage");
        System.out.println("=> ");
        String selection = keyboard.nextLine();

        System.out.println();
        System.out.println();

        if (selection.equals("1")){
            addTicket();
        } else if (selection.equals("3")){
            exit();
        }

    }

    private void exit() {
    }

    private void addTicket() {
    }

    private void displayExitingMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        System.out.println("=> ");
        String selection = keyboard.nextLine();

        System.out.println();
        System.out.println();

        if (selection.equals("1")){
            standardTicket();
        } else if (selection.equals("2")){
            lostTicket();
        }

    }

    private void lostTicket() {

    }

    private void standardTicket() {
    }


}
