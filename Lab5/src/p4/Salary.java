package p4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Computes salary.
 * 
 * @author Jessica
 * @version 1.0
 */
public class Salary {
    /**
     * The main method.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        double currentSalary; // employee's current salary
        double raisePercent;
        double raise; // amount of the raise
        double newSalary; // new salary for the employee
        String rating; // performance rating

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current salary: ");

        currentSalary = scan.nextDouble();

        System.out.print("Enter the performance rating "
                + "(Excellent, Good, or Poor): ");
        rating = scan.next();

        if (rating.equalsIgnoreCase("Excellent")) {
            raisePercent = 0.06;
        } 
        else if (rating.equalsIgnoreCase("Good")) {
            raisePercent = 0.04;
        } 
        else if (rating.equalsIgnoreCase("Poor")) {
            raisePercent = 0.015;
        } 
        else {
            raisePercent = 0;
        }

        raise = currentSalary * raisePercent;
        newSalary = currentSalary + raise;
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
        scan.close();
    }
}
