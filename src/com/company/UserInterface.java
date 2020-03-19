package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    private void displayEnterMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/In");
        System.out.println("3 - Close Garage");
        System.out.println("=> ");
    }

    private void displayExitingMenu(){
        displayParkingGarageTitle();
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        System.out.println("=> ");
    }

    private void displayTicketBill(){
        displayParkingGarageTitle();
    }

    private void displayLostTicketBill(){
        displayParkingGarageTitle();
    }

}
