package org.example.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private int page;

    public Book(String bookName, int page) {
        this.bookName = bookName;
        this.page = page;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

}
