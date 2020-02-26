package assignment;

public class UnderGradStudent extends Student implements LoanInterest {


    public UnderGradStudent(String name, String studentNumber, double loanAmount){
        super(name, studentNumber, loanAmount);
    }

    public double interest()
    {
        return this.getLoanAmount() * 4;
    }


}