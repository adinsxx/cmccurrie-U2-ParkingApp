package last.one;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {
    private Scanner keyboard;

    public void displayParkingGarageTitle() {
        System.out.println("Best Value Parking Garage\n\n =====================");
    }

    private void displayEnterMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/In");
        System.out.println("3 - Close Garage");
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
        displayParkingGarageTitle();
        System.out.println("Activity:");
        System.out.println("Lost Ticket totals: $" + lostTicket());
        System.out.println("Regular ticket totals: $" + regularTicket());
    }

    private int regularTicket() {
    }

    private int LostTicket() {

    }

    private void addTicket() {

    }

    private void displayExitingMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        String selection = keyboard.nextLine();

        System.out.println();
        System.out.println();

        if (selection.equals("1")){
            standardTicket();
        } else if (selection.equals("2")){
            lostTicket();
        }

    }

    private void standardTicket() {
    }


}
