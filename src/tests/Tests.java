package tests;

import logic.Calculations;
import logic.InterestValues;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Created by william.eyre on 21/03/2017.
 *
 */

public class Tests {

    DecimalFormat df2 = new DecimalFormat(".##");

    @Test
    public void testAFullRunOfTheCode() {

        Calculations fullRun = new Calculations();

        InterestValues values = new InterestValues(1000, 10, 12);

        InterestValues test1 = fullRun.interestCalculations(values);

        Assert.assertEquals(new Double(test1.getTotalInterest()), new Double(100.0));
        Assert.assertEquals(new Double(test1.getTotal()), new Double(1100.0));
        Assert.assertEquals(new Double(test1.getMonthlyInterest()), new Double(8.333333333333334));
    }

}
