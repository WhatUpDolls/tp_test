package springboot.tp.services;

import springboot.tp.controllers.UserRequestBody;
import springboot.tp.entities.User;

import java.util.List;

public interface TpInterface {
    String direBonjour(UserRequestBody userRequestBody);
    User createUser(UserRequestBody userRequestBody);
    List<User> getAllUsers();
    User getUser(int id);
    void deleteUser(int id);
}
