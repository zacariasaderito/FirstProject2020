package assignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {


    private String name;
    private String code;
    private double interest;
    private Student student1;
    private Student student2;
    private Student student3;
    private LoanInterest loanInterest1;
    private LoanInterest loanInterest2;
    private LoanInterest loanInterest3;

    @Before
    public void setUp() throws Exception {
        name = "Aderito";
        code = "n1966975";
        interest = 2;

        //STUDENTS
        student1 = new UnderGradStudent(name, code, interest);
        student2 = new UnderGradStudent("Aderito", "n888889", interest);
        student3 = new PostGradStudent(name, code, interest + 1);


    }

    @Test
    public void testEquality() {
        student2 = student1;
        //Compare student1 with student2 - Equal Objects
        Assert.assertEquals("Object student1 is not equal to Object student3 ",student1,student2);
        System.out.println(student1 + "\n" + student2);

//        //Compare student1 with student2 - Different Objects
//        Assert.assertNotEquals("Object student1 is not equal to Object student2 ",student1,student2);
//        System.out.println(student1 + "\n" + student3);
    }

    @Test
    public void testIdentity() {

        assertNotSame(student1, student3);
        System.out.println("HASH CODE FOR OBJECTS BEFORE CHANGE student3 \n" + "student1: " +student1.hashCode() + "\n" + "student3: " + student3.hashCode() + "\n");

        //MAKING 1 AND 3 THE SAME.
        student3 = student1;
        System.out.println("student3 is now equal to student1\n");

        Assert.assertSame(student1, student3);
        System.out.println("HASH CODE FOR OBJECTS AFTER CHANGE student3 \n" + "student1: " +student1.hashCode() + "\n" + "student3: " + student3.hashCode() + "\n");

    }

    @After
    public void tearDown() throws Exception {

    }

}