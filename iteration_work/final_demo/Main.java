public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);
        
        System.out.println(profileTwo.expectedYearToGraduate); // Original graduation year
        profileTwo.incrementExpectedGraduationYear(); // Increment the graduation year by 1
        System.out.println(profileTwo.expectedYearToGraduate); // Return the incremented graduation year
    }
    
}
