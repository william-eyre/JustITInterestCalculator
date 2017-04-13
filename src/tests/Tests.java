package tests;

import logic.Calculations;
import logic.InterestValues;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by william.eyre on 21/03/2017.
 *
 */

public class Tests {


    @Test
    public void testAFullRunOfTheCode() {

        Calculations fullRun = new Calculations();

        InterestValues values = new InterestValues(1000, 10, 12);

        InterestValues test1 = fullRun.interestCalculations(values);

        Assert.assertEquals(new Double(test1.getTotalInterest()), new Double(100.0));
        Assert.assertEquals(new Double(test1.getTotal()), new Double(1100.0));
        Assert.assertEquals(new Double(test1.getMonthlyInterest()), new Double(8.333333333333334));
    }

    @Test
    public void testSecondFullRun() {

        Calculations fullRun = new Calculations();

        InterestValues values = new InterestValues(5000, 25, 24);

        InterestValues test2 = fullRun.interestCalculations(values);

        Assert.assertEquals(new Double(test2.getTotalInterest()), new Double(2500.0));
        Assert.assertEquals(new Double(test2.getTotal()), new Double(7500.0));
        Assert.assertEquals(new Double(test2.getMonthlyInterest()), new Double(104.16666666666667));
    }



}
