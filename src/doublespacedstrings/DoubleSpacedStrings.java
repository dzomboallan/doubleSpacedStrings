/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublespacedstrings;

/**
 *
 * @author hunnytaggy
 */
import java.util.Scanner;

public class DoubleSpacedStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d;
        int i;
        String s;
        
        Scanner keyboardString = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        i = keyboard.nextInt();
        
        System.out.println("Enter a double");
        d = keyboard.nextDouble();
        
        System.out.println("Enter a string");
        s = keyboardString.nextLine();
        
        System.out.println("");
        System.out.println("You entered:");
        System.out.println("Integer: "+ i);
        System.out.println("Double: "+ d);
        System.out.println("String: "+ s);
        
    }
    
}
