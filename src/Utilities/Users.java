package Utilities;

import java.util.ArrayList;

public class Users
{
    private ArrayList<User> users;

    public Users()
    {
        this.users = new ArrayList();
        users.add(new User("Wallace", "wallacemccarthy@protonamail.com", "123", 100));
        users.add(new User("Ellen", "ellen.zhu@live.com", "123", 120));
        users.add(new User("Warren", "warrenzmccarthy@gmail.com", "123", 140));
        users.add(new User("dan", "danielmccarthy@xmission.com", "123", 160));
        users.add(new User("t", "TesterPerson", "t", 180));

    }

    public ArrayList<User> getUsers()
    {
        return users;
    }
    public User getUsers(int index)
    {
        return users.get(index);
    }
    public ArrayList<User> addUser(String name, String email, String password, int totalPoints)
    {
        users.add(new User(name, email, password, totalPoints));
        return users;
    }

}
