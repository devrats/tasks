package task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUserName(List<Student> studentList) {
        List<UserName> list = new ArrayList<>();
        for (Student student : studentList) {
            UserName userName = new UserName(student.getFIRST_NAME() + student.getLAST_NAME() + String.valueOf(student.getCurrentYear()) + String.valueOf(student.getRollNumber()));
            list.add(userName);
            student.setUserName(userName);
        }
        return list;
    }

    public List<Password> createListOfRandomPassword(List<Student> studentList) {
        List<Password> list = new ArrayList<>();
        for (Student student : studentList) {
            Random random = new Random();
            random.nextInt(18);
            String a = "";
            int limit = (random.nextInt(20) + 6) % 18;
            for (int index = 0; index < limit; index++) {
                char code = (char) random.nextInt(33);
                a = a + code;
            }
            Password password = new Password(a + String.valueOf(student.getRollNumber()));
            list.add(password);
            student.setPassword(password);
        }
        return list;
    }
}
