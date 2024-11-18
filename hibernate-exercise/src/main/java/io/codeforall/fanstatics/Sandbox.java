package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    private static User user;
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

// Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

// Used to test the database connection, should return 2
        /*Cadet cadet = new Cadet();
        cadet.setId(1);
        cadet.setName("Maria Laura");
        cadet.setAge(32);*/

        User user = new User();
        user.setId(2);
        user.setEmail("maria@gmail.com");
        //user.setCreationTime();
        user.setName("José");


        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();


// Close the database connection
        em.close();

// Shutdown JPA
        emf.close();
    }
}