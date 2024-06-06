package springboot.tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.tp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // Ici grâce à JPA on va pouvoir créer nos requêtes SQL directement avec les mots clés
    // Il va nous créer une méthode mersonnalisée
    //User findByAgeIsAfterOrderByNom(int age, String nom);
    // @Query("select u from User u where u.id = ?1")
    User findById(long id);
    void deleteById(long id);
}
