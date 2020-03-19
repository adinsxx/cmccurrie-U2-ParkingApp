package connor.mccurrie;

import java.io.File;
import java.util.Scanner;

public class TicketDeck {
    private Scanner keyboard;

    public TicketDeck() {
        keyboard = new Scanner(System.in);
        File file = new File("ticketDeck.txt");

    }
}
