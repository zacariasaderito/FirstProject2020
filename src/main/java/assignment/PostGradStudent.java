package assignment;

public class PostGradStudent extends Student implements LoanInterest {

    public PostGradStudent(String name, String studentNumber, double loanAmount)
    {
        super(name, studentNumber, loanAmount);
    }


    public double interest()
    {
        return this.getLoanAmount() * 2;
    }


}