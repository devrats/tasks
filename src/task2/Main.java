package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TestResultGenerator testResultGenerator = new TestResultGenerator();
        HashSet<Student> studentList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 3; index++) {
            System.out.println("Enter roll number");
            String roll = scanner.nextLine();
            System.out.println("Enter first Name");
            String fName = scanner.nextLine();
            System.out.println("enter contact number");
            String contact = scanner.nextLine();
            System.out.println("Enter marks");
            String marks = scanner.nextLine();
            Student student = new Student(Byte.parseByte(roll), fName, Long.parseLong(contact), Double.parseDouble(marks));
            studentList.add(student);
        }
        System.out.println(testResultGenerator.getDetailsOfFailedStudent(studentList));
        System.out.println(testResultGenerator.sortStudentsForRanking(studentList));
    }
}
