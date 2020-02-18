package assignment;

public class student {

    // Variables
    private String name;
    private String studentNumber;
    private double loanAmount;

    public student(String name, String studentNumber, double loanAmount) {

        this.name = name;
        this.studentNumber = studentNumber;
        this.loanAmount = loanAmount;

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    /*
    public String toString()
    {
        return
    }
    */

    @Override
    public String toString() {
        return "STUDENT " + "\nname=" + name + "\nstudNum=" + studentNumber + "\nloanAmount=" + loanAmount + "\n";
    }

}
