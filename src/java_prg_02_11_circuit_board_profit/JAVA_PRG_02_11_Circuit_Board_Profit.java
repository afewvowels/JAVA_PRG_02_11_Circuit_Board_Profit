/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_11_circuit_board_profit;

import java.util.Scanner;

/**
 *
 * @author bluebackdev
 * An electronics company sells circuit board at a 40 percent profit. If you
 * know the retail price of a circuit board, you can calculate its profit
 * with the following formula:
 * 
 *  Profit = Retail price x 0.4
 * 
 * Write a program that asks the user for the retail price of a circuit board,
 * calculates the amount of profit earned for the product, and displays the
 * result on the screen.
 */
public class JAVA_PRG_02_11_Circuit_Board_Profit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define constant for percent profit
        final float FLT_PERCENT_PROFIT = 0.40f;
        
        // Declare variables for calculating total profit
        float fltRetailPrice;
        float fltProfit;
        
        // Define keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt user input and store result
        System.out.print("Plese enter your item's retail price: $");
        fltRetailPrice = scrKeyboard.nextFloat();
        
        // Calculate profit
        fltProfit = fltRetailPrice * FLT_PERCENT_PROFIT;
        
        // Output result to console
        System.out.println("With a retail price of $" + fltRetailPrice +
                            " and a profit margin of " + (FLT_PERCENT_PROFIT * 100) +
                            "%, your total profit is: $" + fltProfit);
    }
    
}
