package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

       Microscope microscope = new Microscope();
       Balance balance = new Balance();

       microscope.setName("Zeiss");
       microscope.setId(1);
       microscope.setCode(2345);

       balance.setId(2);
       balance.setCode(2425);

       em.close();

       emf.close();
    }
}