package main.java.com.ibmrCollege.pratique;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        
        int i = 0;

        do {

            System.out.println("|------ Home ------|");
            System.out.println("");
            System.out.println(" " + "[2] User");
            System.out.println(" " + "[1] Events");
            System.out.println(" " + "[0] Exit");
            System.out.println("");
            System.out.println("|------------------|");
            System.out.print("Navigate: ");
            i = read.nextInt();
            
            switch (i) {
                case 0:
                
                    read.close();
                    break;
                
                case 1:
                    //call users main method

                    System.out.println("works!");
                    break;

                case 2:
                    //call events main method
                    
                    System.out.println("works!");
                    break;

                default:

                    System.out.println("");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!! It's not a key. Try again! !!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("");

                    break;
            }
            
        } while (i != 0);
        
    }
}
