package springboot.tp.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequestBody {
    private String nom;
    private int age;

    @Override
    public String toString() {
        log.info("mon objet");
        return super.toString();
    }
}
