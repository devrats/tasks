package task1;

import java.util.Objects;

public class Student {

    private byte rollNumber;
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private byte currentYear;
    private UserName userName;
    private Password password;

    @Override
    public String toString() {
        return " rollNumber=" + rollNumber +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", currentYear=" + currentYear +
                ", userName=" + userName +
                ", password=" + password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && currentYear == student.currentYear && Objects.equals(FIRST_NAME, student.FIRST_NAME) && Objects.equals(LAST_NAME, student.LAST_NAME) && Objects.equals(userName, student.userName) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, FIRST_NAME, LAST_NAME, currentYear, userName, password);
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    public Student(byte rollNumber, String FIRST_NAME, String LAST_NAME, byte currentYear) {
        this.rollNumber = rollNumber;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.currentYear = currentYear;
    }
}
