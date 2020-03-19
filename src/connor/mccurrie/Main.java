package connor.mccurrie;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Machine one = new Machine();


    public static void main(String[] args) {
        UserInterface UI; //TryCatch interface

        {
            try {
                UI = new UserInterface();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
