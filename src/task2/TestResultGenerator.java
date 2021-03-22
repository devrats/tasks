package task2;

import java.util.*;
import java.util.stream.Collectors;

public class TestResultGenerator {

    public HashSet<String> getDetailsOfFailedStudent(Set<Student> studentSet) {
        HashSet<String> hashSet = new HashSet<>();
        studentSet.stream().filter(e -> e.getMarks() < 30).forEach(e -> hashSet.add(e.getNAME() + "-" + String.valueOf(e.getCONTACT_NUMBER())));
//        for (Student student : studentSet) {
//            if (student.getMarks() < 30) {
//                hashSet.add(student.getNAME() + "-" + String.valueOf(student.getCONTACT_NUMBER()));
//            }
//        }
        return hashSet;
    }

    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {

        return  studentSet.stream().sorted((o1, o2) -> Double.compare(o1.getMarks(),o2.getMarks())).collect(Collectors.toSet());
/*
        Set<Student> set = new HashSet<>();
        List<Student> list = new ArrayList<>();
        for (Student student : studentSet) {
            list.add(student);
        }
        Collections.sort(list);
        for (Student student : list) {
            set.add(student);
        }
        return set;
    }
*/
    }
}
