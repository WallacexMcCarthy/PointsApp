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

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }
}
