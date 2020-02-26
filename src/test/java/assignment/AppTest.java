package assignment;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {

    private String name;
    private String code;
    private double interest;
    private Student student1;
    private Student student2;
    private Student student3;


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

        Assert.assertEquals("Object student1 is not equal to Object student3 ",student1,student2);
        System.out.println(student1 + "\n" + student2);

    }

    @Test
    public void testIdentity() {

        //MAKING 1 AND 3 THE SAME.
        student3 = student1;
        System.out.println("student3 is now equal to student1\n");

        Assert.assertSame(student1, student3);
        System.out.println("HASH CODE FOR OBJECTS AFTER CHANGE student3 \n" + "student1: " +student1.hashCode() + "\n" + "student3: " + student3.hashCode() + "\n");

    }

    @Test (timeout = 200)
    public void testIdentityWithTimeout(){
        while (student3 != student1);
    }


    @Test
    public void FaillingTest() {

        //Compare student1 with student2 - Different Objects
        Assert.assertNotEquals("Object student1 is equal to Object student2 ",student1,student2);
        fail();
        System.out.println(student1 + "\n" + student3);
    }

    @Ignore
    @Test
    public void disablingTest() {
        Assert.assertNotNull(student2);

    }

    @After
    public void tearDown() throws Exception {
    }

}