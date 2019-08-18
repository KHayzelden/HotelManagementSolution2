
package hotelobjectsolution;

import java.util.Scanner;

public class HotelObjectSolution {

    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
     
        boolean running = true ; //used to loop the menu until the user wishes to exit
        char menuChoice ;
        
        printMenu();
        
        while (running)
        {
            menuChoice = getMenuChoice();
            
            switch (menuChoice) 
            {
                case 'V' : // view all rooms
                     
                    break;
                case 'A' : // add customers to room
                    
                    break;
                case 'E' : // view empty rooms
                    
                    break;
                case 'D' : // remove customer from room
                    
                    break;
                case 'F' : // search rooms by customer name
                    
                    break;
                case 'S' : // save current room listings
                    
                    break;    
                case 'L' : // load last saved room listings
                    
                    break;
                case 'O' : // view occupied rooms in order of customer name
                    
                    break; 
                case 'M' : // shows the menu again
                    printMenu();
                    break;
                case 'Q' : // quit program
                    running = false ;
                    break;
            }
        }
        
    }
    
    //prints out the menu options, this is only done at the beginning and on command to avoid clutter
    private static void printMenu(){
    
        System.out.println();
        System.out.println("-*-*-*-*- Menu -*-*-*-*-");
        System.out.println("V: View all rooms");
        System.out.println("A: Add customer to room");
        System.out.println("E: View empty rooms");
        System.out.println("D: Remove customer from a room");
        System.out.println("F: Search rooms by customer name");
        System.out.println("S: Save current room listings");
        System.out.println("L: Load last saved room listings");
        System.out.println("O: View occupied rooms in order of customer name");
        System.out.println("Q: Quit program");
        
    }
    
    //asks for a char choice corresponding to the menu, will run validation and return a menu choice
    private static char getMenuChoice () {
        
        String input;
        char acceptedChar = 'X';
        boolean acceptableInput = false;
        
        System.out.println();
        System.out.print("Please enter your choice from the menu or enter "
                + "\"M\" to show the menu again: ");
        input = keyboard.nextLine();
        
        while (!acceptableInput)
        {
            try 
            {
                acceptedChar = input.charAt(0);
                acceptedChar = Character.toUpperCase(acceptedChar);
                
                if (acceptedChar == 'V' || acceptedChar == 'A' || acceptedChar == 'E' || acceptedChar == 'D' || 
                    acceptedChar == 'F' || acceptedChar == 'S' || acceptedChar == 'L' || acceptedChar == 'O' || 
                    acceptedChar == 'M' || acceptedChar == 'Q') 
                    
                    acceptableInput = true ;
                
                else
                {
                    System.out.println("That is an invalid option.");
                    System.out.println();
                    System.out.print("Please enter one of the menu options as listed above: ");
                    input = keyboard.nextLine();
                }

            }
            catch (NumberFormatException e)
            {
                System.out.println("That is an invalid option.");
                System.out.println();
                System.out.print("Please enter one of the menu options as listed above: ");
                input = keyboard.nextLine();
            }
        }
       
        return acceptedChar ;      
    
    }
    
}
