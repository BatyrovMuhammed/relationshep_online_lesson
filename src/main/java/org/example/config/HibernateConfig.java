package org.example.config;

import org.example.OneToMany.Author;
import org.example.OneToMany.Book;
import org.example.oneToOne.IdCard;
import org.example.oneToOne.Person;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {

    public static EntityManager createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/java7");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "1234");

        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty(SHOW_SQL, "true");

        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(Book.class);

        return configuration.buildSessionFactory().createEntityManager();
    }

//    public static EntityManagerFactory createSessionFactory() {
//        Properties properties = new Properties();
//        properties.put(Environment.DRIVER, "org.postgresql.Driver");
//        properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/java7");
//        properties.put(Environment.USER, "postgres");
//        properties.put(Environment.PASS, "1234");
//
//        properties.put(Environment.HBM2DDL_AUTO, "update");
//        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//        properties.put(Environment.SHOW_SQL, "true");
//
//        Configuration configuration = new Configuration();
//        configuration.addProperties(properties);
//        configuration.addAnnotatedClass(User.class);
//
//        return configuration.buildSessionFactory();
//    }
}