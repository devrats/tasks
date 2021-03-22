package task2;

import java.util.Objects;

public class Student implements Comparable {

    private byte rollNumber;
    private final String NAME;
    private final long CONTACT_NUMBER;
    private double marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", NAME='" + NAME + '\'' +
                ", CONTACT_NUMBER=" + CONTACT_NUMBER +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && CONTACT_NUMBER == student.CONTACT_NUMBER && Double.compare(student.marks, marks) == 0 && Objects.equals(NAME, student.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, NAME, CONTACT_NUMBER, marks);
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getNAME() {
        return NAME;
    }

    public long getCONTACT_NUMBER() {
        return CONTACT_NUMBER;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(byte rollNumber, String NAME, long CONTACT_NUMBER, double marks) {
        this.rollNumber = rollNumber;
        this.NAME = NAME;
        this.CONTACT_NUMBER = CONTACT_NUMBER;
        this.marks = marks;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(this.marks, ((Student) o).marks);
    }
}