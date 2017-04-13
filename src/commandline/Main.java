package commandline;

import logic.InterestValues;
import logic.Calculations;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by william.eyre on 21/03/2017.
 *
 */
public class Main {

    public static void main(String[] args) {

        new Main();

    }

    /* Constructor */
    private Main() {
        InterestValues values = gatherInputValues();

        values = new Calculations().interestCalculations(values);

        outputValues(values);
    }

    private InterestValues gatherInputValues() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan amount: £");
        double amountBorrowed = input.nextDouble();

        System.out.println("what was the interest rate?");
        double interestRate = input.nextDouble();

        System.out.println("How long did you borrow the money for, in months");
        double timeBorrowed = input.nextDouble();

        return new InterestValues(amountBorrowed, interestRate, timeBorrowed);
    }

    private void outputValues(InterestValues values) {

        // formats the output to be two decimal places.
        DecimalFormat df2 = new DecimalFormat(".##");

        System.out.println("Total interest paid £" + df2.format(values.getTotalInterest()));
        System.out.println("Total paid back £" + df2.format(values.getTotal()));
        System.out.println("Monthly interest paid £ " + df2.format(values.getMonthlyInterest()));

        System.out.println("Total interest paid £" + (values.getTotalInterest()));
        System.out.println("Total paid back £" + (values.getTotal()));
        System.out.println("Monthly interest paid £ " + (values.getMonthlyInterest()));
    }



}
