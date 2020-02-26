package assignment;

public class Student {

    // Attributes
    private String name;
    private String studentNumber;
    private double loanAmount;

    public Student(String name, String studentNumber, double loanAmount) {

        this.name = name;
        this.studentNumber = studentNumber;
        this.loanAmount = loanAmount;

    }

    @Override
    public String toString() {
        return  getClass()+
                "\nname=" + name +
                "\nstudNum=" + studentNumber +
                "\nloanAmount=" + loanAmount + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}

