package assignment;

public class postGrad extends student  implements loanInterest {

    public postGrad(String name, String studentNumber, double loanAmount){

        super(name, studentNumber, loanAmount);

    }

    public double interest()
    {
        return super.getLoanAmount() * 0.10;
    }


}