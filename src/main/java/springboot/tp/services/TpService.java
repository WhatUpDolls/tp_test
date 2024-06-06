package springboot.tp.services;

import org.springframework.stereotype.Service;
import springboot.tp.controllers.UserRequestBody;
import springboot.tp.entities.User;
import springboot.tp.repositories.UserRepository;

import java.util.List;

@Service
public class TpService implements TpInterface {

    private UserRepository userRepository;

    public TpService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String direBonjour(UserRequestBody userRequestBody) {
        return "Bonjour " + userRequestBody.getNom()+ " "+userRequestBody.getAge();
    }

    @Override
    public User createUser(UserRequestBody userRequestBody) {
        User user = new User();
        user.setNom(userRequestBody.getNom());
        user.setAge(userRequestBody.getAge());

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
