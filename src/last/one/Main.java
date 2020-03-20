package last.one;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new UserInterface();
    }
    private Scanner keyboard;



    public void WriteFile() throws IOException {
        keyboard = new Scanner(System.in);
        FileWriter ticketDeck = new FileWriter("tickedeck.txt");
        //add in ticket id + time spent in garage
        ArrayList<Ticket> writeTickets = new ArrayList<>();

        ticketDeck.close();

    }




}


