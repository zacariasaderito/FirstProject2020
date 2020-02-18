package assignment;

public class smallBusiness implements loanInterest{

    // Variables

    private String name;
    private String registerNum;
    private double loanAmount;


    public smallBusiness(String name, String registerNumber, double loanAmount)
    {
        name = name;
        registerNum = registerNumber;
        loanAmount = loanAmount;

    }

    public String toString()
    {
        return "SMALL BUSINESS" + "\nName" + name + "\nRegister Number" + registerNum + "\nAmount" + loanAmount + "\n";
    }

    public double interest()
    {
        return loanAmount * 0.15;
    }

}