package task1;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PortalCredentialsCreator portalCredentialsCreator = new PortalCredentialsCreator();
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 1; index++) {
            System.out.println("Enter roll number");
            String roll = scanner.nextLine();
            System.out.println("Enter first Name");
            String fName = scanner.nextLine();
            System.out.println("enter last Name");
            String lName = scanner.nextLine();
            System.out.println("Enter current Year");
            String currentYear = scanner.nextLine();
            Student student = new Student(Byte.parseByte(roll), fName, lName, Byte.parseByte(currentYear));
            studentList.add(student);
        }
        System.out.println(portalCredentialsCreator.createListOfRandomPassword(studentList));
        System.out.println(portalCredentialsCreator.createListOfUserName(studentList));
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
