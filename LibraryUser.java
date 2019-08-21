package finalproject;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class LibraryUser {

    void main3() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to enter user information into a file ");
        System.out.println("Enter 2 to read user information from a file ");
        System.out.print("Enter 0 to exit: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.print("Enter the name of the new file: ");
            String file = input.next();
            System.out.print("Name of the user:  ");
            String username = input.next();

            //put strings into arraylist
            ArrayList<String> array = new ArrayList<String>();
            array.add(0, "Username: " + username);

            try {
                //create the file
                PrintWriter pw = new PrintWriter(new FileOutputStream(file + ".txt"));
                FileOutputStream fo = new FileOutputStream(file);
                int datlist = array.size();
                //write the data seperately from the array into the file
                for (int i = 0; i < datlist; i++) {
                    pw.write(array.get(i).toString() + "\r\n");
                }
                //close the array
                pw.close();
                fo.close();
            } catch (FileNotFoundException e) {
                System.out.print("File Does Not Exist!");

            }
        }

        if (number == 2) {
            //read file so this will print out the contents of the file
            System.out.println("Enter the name of the file: ");
            String FileName = input.next();
            FileInputStream fstream = new FileInputStream(FileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            
            String str;
            //Print the contents of the file to the reader
            while ((str = br.readLine()) != null) {
                System.out.println(str);

            }

            br.close();
        }
        if (number == 0){
            System.exit(0);
        }

    }
}
