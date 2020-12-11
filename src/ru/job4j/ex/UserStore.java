package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                user = value;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("user not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername() == null || user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("not correct name");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            User[] users = {new User("Petr Arsentev", true)};
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException i) {
           i.printStackTrace();
        }
    }
}