package com.gal;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryProvider {

private static EntityManagerFactory emf =
Persistence.createEntityManagerFactory("supply_pu");

public static EntityManager getEntityManager() {
return emf.createEntityManager();
}

public static void close() {
emf.close();
}

public static void closeConnection() {
	// TODO Auto-generated method stub
	
}

}