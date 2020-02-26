package assignment;

public class SmallBusiness implements LoanInterest {

    // Variables
    private String name;
    private String regNumber;
    private double loanAmount;

    public SmallBusiness(String name, String regNumber, double loanAmount)
    {
        this.name = name;
        this.regNumber = regNumber;
        this.loanAmount = loanAmount;
    }

    public String toString()
    {
        return "SMALL BUSINESS" + "\nName" + name + "\nRegister Number" + regNumber + "\nAmount" + loanAmount + "\n";
    }

    public double interest()
    {
        return loanAmount * 10;
    }

}