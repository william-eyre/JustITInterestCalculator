package logic;

/**
 * Created by william.eyre on 21/03/2017.
 */
public class Calculations {


    /**
     * this method is performing the mathematics for the programme
     *
     * @return values
     */

    public InterestValues interestCalculations(InterestValues values) {

        values.setTimeInMonths(values.getTimeBorrowed() / 12);
        values.setTotalInterest(values.getAmountBorrowed() * values.getInterestRate() * values.getTimeInMonths());
        values.setTotal(values.getAmountBorrowed() + values.getTotalInterest());
        values.setMonthlyInterest(values.getTotalInterest() / values.getTimeBorrowed());

        return values;
    }
}
