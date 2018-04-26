// Programmer:  Jane Doe, ITPRG 147 
// Pages 56-57: ComputeLoanUsingInputDialog  
//  MODIFIED USING EXCEPTION HANDLING
// File Name:  ComputeLoanUsingInputDialog.java
//

import javax.swing.JOptionPane;
import java.util.*;

public class ComputeLoanUsingInputDialog {
  public static void main(String[] args) {	// start public static void main
    String annualInterestRateString;
    double annualInterestRate = 0.0;
    double loanAmount = 0.0;
    int numberOfYears = 0;
    String numberOfYearsString;
    String loanString;
    boolean continueInput = true;

    do {					// start of do
      try {					// start of try
        // Enter yearly interest rate
        annualInterestRateString = 
          JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25:");

       // Convert string to double
       annualInterestRate = 
         Double.parseDouble(annualInterestRateString);

       continueInput = false;
      }						// end of try

       catch (NumberFormatException ex) {	// start of catch
         JOptionPane.showMessageDialog(null, "Try again. (" +
           "Incorrect input:  an decimal value is required.)");
       }					// end of catch
     } while (continueInput);			// end of try...catch

      
    continueInput = true;
    do {					// start of do
      try {					// start of try
        // Enter number of years
        numberOfYearsString = 
          JOptionPane.showInputDialog("Enter number of years as an integer, \nfor example 5:");

        // Convert string to int
        numberOfYears = Integer.parseInt(numberOfYearsString);

        continueInput = false;
      }						// end of try

       catch (NumberFormatException ex) {	// start of catch
         JOptionPane.showMessageDialog(null, "Try again. (" +
           "Incorrect input:  an integer value is required.)");
       }					// end of catch
     } while (continueInput);			// end of try...catch


    continueInput = true;
    do {					// start of do
      try {					// start of try
       // Enter loan amount
       loanString = 
         JOptionPane.showInputDialog("Enter loan amount, for example 120000.95:");

       // Convert string to double
       loanAmount = Double.parseDouble(loanString);

       continueInput = false;
      }						// end of try

       catch (NumberFormatException ex) {	// start of catch
         JOptionPane.showMessageDialog(null, "Try again. (" +
           "Incorrect input:  a decimal value is required.)");
       }					// end of catch
     } while (continueInput);			// end of try...catch


     // Obtain monthly interest rate
     double monthlyInterestRate = annualInterestRate / 1200;

     // Calculate payment
     double monthlyPayment = loanAmount * monthlyInterestRate / 
       (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
     double totalPayment = monthlyPayment * numberOfYears * 12;

     // Format to keep two digits after the decimal point
     monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
     totalPayment = (int)(totalPayment * 100) / 100.0;

    // Display results
    String output = "The monthly payment is " + monthlyPayment + 
      "\nThe total payment is " + totalPayment;
    JOptionPane.showMessageDialog(null, output);
  }						// end of do...while

}						// end of public static void main

