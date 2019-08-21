/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibrarySearch {

    void main2() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        
        File dir = new File("C:/Users/Jeet/Documents/NetBeansProjects/FinalProject");

        //get all the files in the directory
        File[] listOfFiles = dir.listFiles();
        
        System.out.println("--------------------------------------------");
        System.out.println("What would you like to search in the database? ");
        
        
        String search = input.next();
            
        //sort the the files in listOfFiles to equal i
        for (int i = 0; i < listOfFiles.length; i++) {
            String filename = listOfFiles[i].getName();
            
            //search each file for keyword           
           if (search == filename) {
                System.out.println("YEss");
            }
        }
        
        for(File file : listOfFiles){
            if (file.isFile()){
                String filename = file.getName();
                if (filename == search){
                    System.out.println("Yess");
                }
            }
        }
    }
}