package last.one;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);
    TicketTracker tickTrack = new TicketTracker();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Ticket ticket = new Ticket();
        Time time = new Time();

        UserInterface UI = new UserInterface();
        char selection;
        boolean choices = true;

        while (choices) {
            UI.displayEnterMenu();
            selection = UI.getMenu();
            switch (selection) {
                case '1': UI.checkIn(); break;
                case '2': UI.checkOut(); break;
                case '3': UI.exitProgram();break;
            }
        }

    }

    public void WriteFile() throws IOException {
        keyboard = new Scanner(System.in);
        FileWriter ticketDeck = new FileWriter("ticketdeck.txt");
        //add in ticket id + time spent in garage
        ticketDeck.write(String.valueOf(tickTrack.setTicketID()) + ", " + tickTrack.getTime());
        ticketDeck.close();

    }

//    public void ReadFile() {
//        tickTrack = new TicketTracker();
//
//    }


}


