package assignment;


import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main( String[] args ) {
        loanInterest u1 = new underGrad("Daniel", "99119911", 5000);
        loanInterest u2 = new postGrad("Aderito", "88228822", 4000);
        loanInterest u3 = new smallBusiness("ADJZ company", "00003456", 5000);

        loanInterest[]  user= new loanInterest[4];

        user[0] = u1;
        user[1] = u2;
        user[2] = u3;

        for (int i = 0;i < 3; i++) {

            if (user[i] instanceof underGrad)
            {
                System.out.println("Loan Interest for Under Graduate Student : " + u1.interest());
            }
            else if (user[i] instanceof postGrad)
            {
                System.out.println("Loan Interest for Post Graduate: " + u2.interest());
            }
            else if (user[i] instanceof smallBusiness)
            {
                System.out.println("Loan Interest for Small Bussiness: " + u3.interest() );
            }
        }

    }
}
