package org.example.oneToOne;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
    private IdCard idCard;
}
