package finalproject;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LibraryStorage {

     void main1() throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Enter 1 to create a new file ");
        System.out.println("Enter 2 to read from a file ");
        System.out.print("Enter 0 to exit: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.print("Enter the name of the new file (Ex: name of the book): ");
            String file = input.next();
            System.out.print("Enter the item number: ");
            String itemnumber = input.next();
            System.out.print("Enter the type of media: ");
            String mediatype = input.next();
            System.out.print("Enter the location in the library(Dewey Decimal Number): ");
            String location = input.next();

            //put strings into arraylist
            ArrayList<String> array = new ArrayList<String>();
            array.add(0, "Item Number: " + itemnumber);
            array.add(1, "Media Type: " + mediatype);
            array.add(2, "Location: " + location);

            try {
                //create a file
                PrintWriter pw = new PrintWriter(new FileOutputStream(file + ".txt"));
                FileOutputStream fo = new FileOutputStream(file);
                //write the individual data into the array into the file
                int datlist = array.size();
                for (int i = 0; i < datlist; i++) {
                    pw.write(array.get(i).toString() + "\r\n");

                }
                //close the file to complete the write
                pw.close();
                fo.close();
            } catch (FileNotFoundException e) {
                System.out.print("File Does Not Exist!");

            } catch (IOException ex) {
                Logger.getLogger(LibraryStorage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (number == 2) {
            //read file so this will print out the contents of the file
            System.out.println("Enter the name of the file: ");
            String FileName = input.next();
            FileInputStream fstream = new FileInputStream(FileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String str;
            //print the contents of the file
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