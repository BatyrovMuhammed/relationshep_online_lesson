package org.example.oneToOne;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "id_cards")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dateOfStart;
    private String dateOfFinish;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    public IdCard(String dateOfStart, String dateOfFinish, String gender, Person person) {
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
        this.gender = gender;
        this.person = person;
    }
}
