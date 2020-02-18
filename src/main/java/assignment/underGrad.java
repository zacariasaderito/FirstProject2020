package assignment;

public class underGrad extends student  implements loanInterest {


    public underGrad(String name, String studentNumber, double loanAmount){

        super(name, studentNumber, loanAmount);

    }

    public double interest()
    {
        return super.getLoanAmount() * 0.12;
    }


}