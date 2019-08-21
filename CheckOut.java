package finalproject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeet
 */
public class CheckOut {

    void main4() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to check out a book:  ");
        System.out.print("Enter 0 to exit: ");
        
        int number = input.nextInt();
        
        if (number == 1) {
            System.out.print("Enter the name of the new file: ");
            String file = input.next();
            System.out.print("Name of the user:  ");
            String username = input.next();
            System.out.print("Enter the name of the media: ");
            String name = input.next();
            
            //put strings into arraylist
            ArrayList<String> array = new ArrayList<String>();
            array.add(0, "Username: " + username);
            array.add(1, "Name: " + name);

            try {
                //create the file
                PrintWriter pw = new PrintWriter(new FileOutputStream(file + ".txt"));
                FileOutputStream fo = new FileOutputStream(file);
                int datlist = array.size();
                //write the data seperately from the array into the file
                for (int i = 0; i < datlist; i++) {
                    pw.write(array.get(i).toString() + "\r\n");
                }
                //close the file
                pw.close();
                fo.close();
            } catch (FileNotFoundException e) {
                System.out.print("File Does Not Exist!");

            }
        
    }
    
}
}
