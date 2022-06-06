
package libraryproj;


public class Student {

    private String Stud_en_Date;
    private String student_ID;
    private String specialization;
    private double budget;

    public Student() {

    }

    public Student(String student_ID, String specialization, String Stud_en_Date, double budget) {

    }

    public Student(String student_ID, String specialization, String Stud_en_Date, double budget, int id, String name, String gender, String phoneNumber, String address) {

        this.student_ID = student_ID;
        this.specialization = specialization;
        this.Stud_en_Date = Stud_en_Date;
        this.budget = budget;
    }
    //get

    public String getstudent_ID() {
        return student_ID;
    }

    public String getspecialization() {
        return specialization;
    }

    public String getStud_en_Date() {
        return Stud_en_Date;
    }

    public double getBudget() {
        return budget;
    }
    //set

    public void setstudent_ID(String studentId) {
        this.student_ID = student_ID;
    }

    public void setspecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setStud_en_Date(String Stud_en_Date) {
        this.Stud_en_Date = Stud_en_Date;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        String result = "";
        result = super.toString();
        result += "StudentID: " + this.student_ID + "\n";
        result += "Specialization: " + this.specialization + "\n";
        result += "Enrolled Date: " + this.Stud_en_Date + "\n";
        result += "Budget: " + this.budget + "\n";
        result += "--------------------------------------";

        return result;

    }

    void setName(String next) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setId(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setGender(String next) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPhoneNumber(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
