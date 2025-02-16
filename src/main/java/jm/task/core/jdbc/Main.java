package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Илон", "Маск", (byte)11);
        userService.saveUser("Виктория", "Балакирева", (byte)5);
        userService.saveUser("Макс", "Стил", (byte)24);
        userService.saveUser("По", "Панда", (byte)40);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();// реализуйте алгоритм здесь
    }
}
