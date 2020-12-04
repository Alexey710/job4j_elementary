package ru.job4j.ex;

public class User {

    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() throws UserInvalidException {
        if (username.length() < 3) {
            throw new UserInvalidException("User's name is invalid.");
        }
        return true;
    }
}
