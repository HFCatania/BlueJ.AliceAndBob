/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scnr.nextLine();
        
        if (name.equalsIgnoreCase("Alice")) {
        System.out.print("Ahoyhoy Alice!");
    } else if (name.equalsIgnoreCase("Bob")) {
        System.out.print("Ahoyhoy Bob!");
    } else { 
        System.out.print("Piss off stranger!");
    }      
}
}
