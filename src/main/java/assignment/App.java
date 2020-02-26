package assignment;


import java.util.Scanner;

public class App
{
    private static Scanner input = new Scanner(System.in);
    private String name;
    private String code;
    private double amount;


    public static void main( String[] args ) {

        System.out.println("Name:");
        System.out.println("Code:");
        System.out.println("Interest:");



    } // Main

    public void createObject(){

        LoanInterest firstStudent = new PostGradStudent("Aderito", "n1", 2);

        System.out.println(firstStudent.toString());
        System.out.printf("Interest: " + firstStudent.interest());
    }

}

/**
 * loanInterest newObject = new underGrad(name, reference, amount);
 *         while ((objType != 0) || (objType != 1) || (objType != 2) || (objType != 3)){
 *             System.out.println("Wrong imput! Enter a valid command (0 - 3) ");
 *             System.out.println("  ");
 *             menu();
 *             break;
 *         }
 *         if (objType == 1) {
 *             newObject = new underGrad(name, reference, amount);
 *         } else if (objType == 2){
 *             newObject = new postGrad(name, reference, amount);
 *         } else if (objType == 3){
 *             newObject = new smallBusiness(name, reference, amount);
 *         }else {
 *             System.out.println("Thank you for using our App!");
 *             System.exit(0);
 *         }
 */
