package connor.mccurrie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface {

    private Scanner keyboard;

    public UserInterface() throws FileNotFoundException {
        keyboard = new Scanner(System.in);
        File file = new File("ticketDB.txt");
        //add an arraylist
        //add in if statement for ticket storage

    }

    public void displayParkingGarageTitle() {
        System.out.println("Best Value Parking Garage\n\n =====================");
    }



}
