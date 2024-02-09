public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declaredMajor, double gpa, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    // Increment the graduation year by 1
    public int incrementExpectedGraduationYear() {
        return (this.expectedYearToGraduate = this.expectedYearToGraduate + 1);
    }
}