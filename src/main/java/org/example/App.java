package org.example;

import org.example.OneToMany.Author;
import org.example.OneToMany.Book;
import org.example.config.HibernateConfig;
import org.example.oneToOne.IdCard;
import org.example.oneToOne.Person;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //System.out.println(HibernateConfig.createSessionFactory());

        Book book1 = new Book("Syngan Kylych",100);
        Book book2 = new Book("Jamila",140);
        Book book3 = new Book("Ak keme",50);
        Book book4 = new Book("Birin mugalim",200);

        Book book5 = new Book("Kyz",300);
        Book book6 = new Book("Tanky jyldyzdar",300);

        Author author1 = new Author("Chyngyz Aitmatov","Kyrgyz");
        author1.addBooks(book1);
        author1.addBooks(book2);
        author1.addBooks(book3);
        author1.addBooks(book4);

        Author author2 = new Author("Alykul Osmonov","Kyrgyz");
        author2.addBooks(book4);
        author2.addBooks(book5);


       save(author1);
      // save(author2);

    }
    public static void save(Author author){
        EntityManager entityManager = HibernateConfig.createSessionFactory();
        entityManager.getTransaction().begin();


        entityManager.persist(author);

        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
