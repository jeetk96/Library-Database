package finalproject;
import java.io.IOException;
import java.util.*;

public class Menu {
    public static void main(String args[]) throws IOException  {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Library!");
        System.out.println("Enter 1 to add to the library database! ");
        System.out.println("Enter 2 to search the library! ");
        System.out.println("Enter 3 for library memberships! ");
        System.out.println("Enter 4 to check out books! ");
        System.out.print("Enter 0 to exit: ");
        char number = input.next().charAt(0);

        if (number == '1') {
            //access LibraryStorage
           new LibraryStorage().main1();
          
        }
        if (number == '2') {
            //access LibrarySearch
            new LibrarySearch().main2();
        }
        
        if (number == '3') {
            //access LibraryUser class
            new LibraryUser().main3();
        }

        if (number == '4') {
            //access CheckOut class    
            new CheckOut().main4();
        }
    }
}
 