package no.hvl.dat250.jpa.basicexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import no.hvl.dat250.jpa.basicexample.*;

//import db_entities.*;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        	EntityCreator entityCreator = new EntityCreator();

	        Person person = entityCreator.createPerson("Max Mustermann");
	        Address address = entityCreator.createAddress("Inndalsveien", 28);
	        CreditCard creditCard = entityCreator.creatCreditCard(12345, -5000, -10000);
	        Pincode pincode = entityCreator.createPincode("123", 1);
	        Bank bank = entityCreator.createBank("Pengebank");

	        em.persist(person);
	        em.persist(address);
	        em.persist(creditCard);
	        em.persist(pincode);
	        em.persist(bank);
        em.getTransaction().commit();
        em.close();
    }
}