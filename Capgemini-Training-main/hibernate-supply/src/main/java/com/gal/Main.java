package com.gal;

import java.sql.Date;
import java.util.List;

import com.gal.model.Item;
import com.gal.model.Supplier;
import com.gal.model.Supply;

import jakarta.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager em = EntityManagerFactoryProvider.getEntityManager();

        try {

            em.getTransaction().begin();

            Supplier s1 = new Supplier(1,"Rajan Enterprises",4.5,"Delhi");
            Supplier s2 = new Supplier(2,"Indian Supply",3.4,"Gurugram");

            Item i1 = new Item(1,"Tomato","Veg");
            Item i2 = new Item(2,"Onion","Veg");
            Item i3 = new Item(3,"Sugar","Groc");

            Supply sp1 = new Supply(1,s1,i2,Date.valueOf("2019-03-03"),36.0,50);
            Supply sp2 = new Supply(2,s1,i3,Date.valueOf("2019-05-05"),10.0,45);
            Supply sp3 = new Supply(3,s2,i1,Date.valueOf("2019-08-15"),50.0,10);

            em.persist(s1);
            em.persist(s2);

            em.persist(i1);
            em.persist(i2);
            em.persist(i3);

            em.persist(sp1);
            em.persist(sp2);
            em.persist(sp3);

            em.getTransaction().commit();
            List<String> q1 =
                em.createQuery("select s.sname from Supplier s", String.class)
                .getResultList();

            System.out.println("All supplier names:");
            for(String name : q1)
                System.out.println(name);
            List<Supplier> q2 =
                em.createQuery("from Supplier s where s.city='Delhi'", Supplier.class)
                .getResultList();

            System.out.println("\nSuppliers from Delhi:");
            for(Supplier s : q2)
                System.out.println(s.getSname());
            List<String> q3 =
                em.createQuery(
                    "select sp.item.name from Supply sp where sp.sid.sid=1",
                    String.class)
                .getResultList();

            System.out.println("\nItems supplied by supplier1:");
            for(String item : q3)
                System.out.println(item);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
            EntityManagerFactoryProvider.closeConnection();
        }
    }
}