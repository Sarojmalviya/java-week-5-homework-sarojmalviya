package week_5_homework;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 *
 * programmes) using if else and while loop.
 */
public class Programme_2_StudentMarkSheet {
    public static void studentMarkSheet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Student Mark Sheet Generator");

        String name;
        int rollNo;
        int math, science, english;
        int total;
        double percentage;
        String result;
        char grade;

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();

        System.out.println("Enter marks for Math, Science, and English (marks should be between 0 to 100):");
        math = getValidMarks("Math", scanner);
        science = getValidMarks("Science", scanner);
        english = getValidMarks("English", scanner);

        total = math + science + english;
        percentage = (double) total / 3;

        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = 'A';
                if (percentage >= 90) {
                    grade = '+';
                }
            } else if (percentage >= 60) {
                grade = 'A';
            } else if (percentage >= 50) {
                grade = 'B';
            } else {
                grade = 'C';
            }
        } else {
            result = "Fail";
            grade = '-';
        }

        printMarkSheet(name, rollNo, math, science, english, total, percentage, result, grade);
        scanner.close();
    }

    public static int getValidMarks(String subject, Scanner scanner) {
        int marks;
        do {
            System.out.print("Enter marks for " + subject + ": ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    public static void printMarkSheet(String name, int rollNo, int math, int science, int english,
                                      int total, double percentage, String result, char grade) {
        System.out.println("___________");
        System.out.println("|                           |");
        System.out.println("|         Mark Sheet        |");
        System.out.println("|_________|");
        System.out.println("| Name      : " + name + "        |");
        System.out.println("| Roll No   : " + rollNo + "         |");
        System.out.println("|_________|");
        System.out.println("| Subjects  : Marks          |");
        System.out.println("|_________|");
        System.out.println("| Math      : " + math + "         |");
        System.out.println("| Science   : " + science + "         |");
        System.out.println("| English   : " + english + "         |");
        System.out.println("|_________|");
        System.out.println("| Total     : " + total + "         |");
        System.out.println("|_________|");
        System.out.println("| Percentage: " + percentage + "      |");
        System.out.println("| Result    : " + result + "        |");
        System.out.println("| Grade     : " + grade + "          |");
        System.out.println("|_________|");
    }
    public static void main(String[] args) {
        studentMarkSheet();
    }
}


