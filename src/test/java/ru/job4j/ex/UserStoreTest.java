package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static ru.job4j.ex.UserStore.findUser;

public class UserStoreTest {

    @Test
    public void whenFindUser() {
        User[] users = {
                new User("Яна", true)
        };
        try {
            Assert.assertThat(findUser(users, "Яна").getUsername(), is("Яна"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = UserInvalidException.class)
    public void whenValidate() throws UserInvalidException {
        User user = new User("Ян", true);
        UserStore.validate(user);
    }
}