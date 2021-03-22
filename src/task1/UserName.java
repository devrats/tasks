package task1;

import java.util.Objects;

public class UserName {
    private String userName;

    @Override
    public String toString() {
        return String.format("username: " + userName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName1 = (UserName) o;
        return Objects.equals(userName, userName1.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserName(String userName) {
        this.userName = userName;
    }
}
