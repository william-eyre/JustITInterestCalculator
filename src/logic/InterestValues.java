package logic;

/**
 * Created by william.eyre on 21/03/2017.
 */
public class InterestValues {


    /* input values */
    private double amountBorrowed;
    private double interestRate;
    private double timeBorrowed;

    /* output values */
    private double totalInterest;
    private double total;
    private double monthlyInterest;
    private double timeInMonths;

    /* constructor for inputs */
    public InterestValues(double amountBorrowed, double interestRate, double timeBorrowed) {
        this.amountBorrowed = amountBorrowed;
        this.interestRate = interestRate/100;
        this.timeBorrowed = timeBorrowed;
    }

    public double getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(double amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getTimeBorrowed() {
        return timeBorrowed;
    }

    public void setTimeBorrowed(double timeBorrowed) {
        this.timeBorrowed = timeBorrowed;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public void setMonthlyInterest(double monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public double getTimeInMonths() {
        return timeInMonths;
    }

    public void setTimeInMonths(double timeInMonths) {
        this.timeInMonths = timeInMonths;
    }


}
