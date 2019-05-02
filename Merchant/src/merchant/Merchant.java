package merchant;
import java.util.Scanner;

public class Merchant {

    public static void main(String[] args) {
        //Initialize variables to zero
        int applesNeeded = 0;
        int applesInStock = 0;
        int applesOnHand = 0;
        int orangesNeeded = 0;
        int orangesInStock = 0;
        int orangesOnHand = 0;
        
        //Create scanner object to grab user input.
        Scanner scnr = new Scanner(System.in);
        
        //Prompt the user to enter how many apples they have on hand.
        System.out.println("How many apples are on hand?");
        applesOnHand = scnr.nextInt();
        
        //Prompt the user to enter how many apples they must have in stock.
        System.out.println("How many apples must be in stock?");
        applesInStock = scnr.nextInt();
        
        //Prompt the user to enter how many oranges they have on hand.
        System.out.println("How many oranges are on hand?");
        orangesOnHand = scnr.nextInt();
        
        //Prompt the user to enter how many oranges they must have in stock.
        System.out.println("How many oranges must be in stock?");
        orangesInStock = scnr.nextInt();
        
        /* if amount of apples on hand is greater than or equal to the amount
           in stock, output that the user doesn't need any apples.
        
           if amount of apples on hand is less than the amount in stock, 
           output how many apples are needed to the user. 
        */
        if (applesOnHand >= applesInStock) 
        {
            applesNeeded = 0;
            System.out.println(applesNeeded + " apples need to be ordered.");
        }
        else
        {
            applesNeeded = applesInStock - applesOnHand;
            System.out.println(applesNeeded + " apples need to be ordered.");
        }
        
        /* if amount of oranges on hand is greater than or equal to the amount
           in stock , output that the user doesn't need any oranges. 
        
           if amount of oranges on hand is less than the amount in stock, 
           output how many oranges are needed to the user. 
        */
        if (orangesOnHand >= orangesInStock)
        {
            orangesNeeded = 0;
            System.out.println(orangesNeeded + " oranges need to be ordered.");
        }
        else
        {
            orangesNeeded = orangesInStock - orangesOnHand;
            System.out.println(orangesNeeded + " oranges need to be ordered.");
        }
    }
    
}
