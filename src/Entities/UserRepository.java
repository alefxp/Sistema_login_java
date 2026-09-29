package Entities;

import java.util.ArrayList;

public class UserRepository {

    public ArrayList<User>users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Boolean emailExists (String email) {
        for ( User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    public User findByEmail (String email) {
        for( User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
