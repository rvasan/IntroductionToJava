
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a main character: ");
        String mainCharacter = keyboard.nextLine();
        
        System.out.print("Enter a number: ");
        String number = keyboard.nextLine();
        
        System.out.print("Enter an evil character: ");
        String evilCharacter = keyboard.nextLine();
       
        System.out.println("Once upon a time there was a " + mainCharacter + ".");
        System.out.println("The "  + mainCharacter +  "had" + number + "hearts.");
        System.out.println("The" + evilCharacter + "'s wife wanted to eat the " + mainCharacter + "'s hearts so both the" + evilCharacter + "s tried to kill the " + mainCharacter +".");
        System.out.println("But the " + mainCharacter + "was too smart and figured out the" + evilCharacter + "s wanted his hearts.");
        System.out.println("So the " + mainCharacter + " killed the" + mainCharacter + "s at night when they were sleeping.");
        System.out.println("The End!");
    }
}
