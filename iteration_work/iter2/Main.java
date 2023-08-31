package iteration_work.iter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int studentAge = 24;
        double studentGpa = 0.123;
        //char studentFirstInitial = 'K';
        //char studentLastInitial = 'A';
        //boolean hasPerfectAttendance = false;
        String studentFirstName = "Kyle";
        String studentLastName = "Adamos";
        //char studentFirstInitial = studentFirstName.charAt(0);
        //char studentLastInitial = studentLastName.charAt(0);
        //System.out.println(studentAge);
        //System.out.println(studentGpa);
        //System.out.println(studentFirstInitial);
        //System.out.println(studentLastInitial);
        //System.out.println(hasPerfectAttendance);
        //System.out.println(studentFirstName);
        //System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);
        
        System.out.println("Enter new GPA:");
        Scanner input = new Scanner(System.in);
        studentGpa = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);
    }
}