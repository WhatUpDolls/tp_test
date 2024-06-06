package springboot.tp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.tp.entities.User;
import springboot.tp.services.TpService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j // permet d'utiliser les logs
public class TpCcontroller {

    @Autowired
    TpService tpService;

    @GetMapping("/bonjour")
    public String bonjour(@RequestParam(name = "name", required = true) String nom,
                          @RequestParam(name = "age") int age) {
        log.info("Un get est appelé");
        return "Bonjour " +nom+ " déjà "+age+" balais !";
    }

    @GetMapping("/aurevoir")
    public String aurevoir() {
        return "Aurevoir";
    }

    @PostMapping("/bonjour")
    public String bonjourPost(@RequestBody UserRequestBody userRequestBody) {
        return tpService.direBonjour(userRequestBody);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserRequestBody userRequestBody) {
       return tpService.createUser(userRequestBody);
    }

    @GetMapping("/user")
    public User getUser(@RequestParam(name = "id", required = true) int id) {
        return tpService.getUser(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return tpService.getAllUsers();
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam(name = "id", required = true) int id) {
        tpService.deleteUser(id);
    }
}
