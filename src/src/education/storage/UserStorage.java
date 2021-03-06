package src.education.storage;

import src.education.exception.userNotFoundException;
import src.education.model.User;
import src.education.util.ArrayUtil;

public class UserStorage {
    private User[] users = new User[10];

    private int size;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public void delete(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(user)) {
                ArrayUtil.deleteByIndex(users, i, size);
                size--;
                break;
            }
        }
    }


    public User getByEmail(String email) throws userNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        throw new userNotFoundException("user with " + email + " email does not exists ");
    }


}
