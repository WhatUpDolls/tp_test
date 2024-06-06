package springboot.tp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
// @Data  Gère les Getter et Setter -> Mieux vaut utiliser getter et setter
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"USER\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "age")
    private int age;
}
