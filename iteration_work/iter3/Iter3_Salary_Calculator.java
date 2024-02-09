public class Iter3_Salary_Calculator {
    public class Main {
    }

    /*public static double salaryCalculator(double hoursPerWeek, double amountPerHour) {
        if (hoursPerWeek < 0.0) {
            return -1.0;
        } else if (amountPerHour < 0.0) {
            return -1.0;
        } else {
            double weeklyPaycheck = hoursPerWeek * amountPerHour;
            double unpaidTime = (double)vacationDays * amountPerHour * 8.0;
            return weeklyPaycheck * 52.0 - unpaidTime;
        }
    }*/

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (amountPerHour < 0) {
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return weeklyPaycheck * 52 - unpaidTime;
    }
    public static void main(String[] args) {
        double salary = salaryCalculator(40, 15, 8);
        System.out.println(salary);
    }
}