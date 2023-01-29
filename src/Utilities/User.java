package Utilities;

public class User
{
    private String name;
    private String email;
    private String password;
    private int totalPoints;
    public User(String name, String email, String password, int totalPoints)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.totalPoints = totalPoints;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}
