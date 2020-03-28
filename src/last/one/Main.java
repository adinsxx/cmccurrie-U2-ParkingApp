package last.one;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Ticket ticket = new Ticket();
        Time time = new Time();
        TicketTracker tickTrack = new TicketTracker();
        UserInterface UI = new UserInterface();
        char selection;
        boolean choices = true;

        while (choices) {
            UI.displayEnterMenu();
            selection = UI.getMenu();
            switch (selection) {
                case '1': UI.checkIn(); break;
                case '2': UI.checkOut(); break;
                default: choices=false; break;
            }
        }

    }

    public void WriteFile() throws IOException {
        keyboard = new Scanner(System.in);
        FileWriter ticketDeck = new FileWriter("tickedeck.txt");
        //add in ticket id + time spent in garage
        ArrayList<Ticket> writeTickets = new ArrayList<>();

        ticketDeck.close();

    }


}


