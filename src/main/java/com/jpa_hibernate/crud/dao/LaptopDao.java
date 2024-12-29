package com.jpa_hibernate.crud.dao;

import com.jpa_hibernate.crud.entity.Laptop;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


public class LaptopDao {

    private final String persistenceUnitName = "jpa-hibernate-a5";
    EntityManager entityManager = Persistence.createEntityManagerFactory(persistenceUnitName).createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();


// 🏳️ Inbuilt Query In JPA from Implementing a Hibernate framework.

    // insert Laptop
    public void InsertLaptopDao(Laptop laptop){
        entityTransaction.begin();
        entityManager.persist(laptop);
        entityTransaction.commit();
    }

    // delete Laptop
    public void deleteLaptopDao(int id){
        Laptop laptop = entityManager.find(Laptop.class,id);
        entityTransaction.begin();
        entityManager.remove(laptop);
        entityTransaction.commit();
    }

    // update Laptop
    public void updateLaptopDao(int id, String name,String color,int price, String mfd){
        Laptop laptop = entityManager.find(Laptop.class,id);
        if (laptop != null){
            laptop.setName(name);
            laptop.setColor(color);
            laptop.setPrice(price);
            laptop.setMfd(LocalDate.parse(mfd));

            entityTransaction.begin();
            entityManager.merge(laptop);
            entityTransaction.commit();
        }
    }

    // Display Laptop by id.
    public Laptop displayLaptopByIdDao(int id){
        return entityManager.find(Laptop.class,id);
    }


// 🏳️ JPQL .................

    // Display All Laptop by Color.
    public List<Laptop> displayLaptopByColorDao(String color){
        Query query = entityManager.createNativeQuery("SELECT * FROM Laptop WHERE color = ?",Laptop.class);
        query.setParameter(1,color);

        @SuppressWarnings("unchecked") // Suppress warning because a result is explicitly mapped
        List<Laptop> laptopList = query.getResultList();
        return laptopList;

    }

    public List<Laptop> getLaptopsByNameDao(String name) {
        TypedQuery<Laptop> query = entityManager.createQuery("SELECT l FROM Laptop l WHERE l.name = :name", Laptop.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    // Display All Laptop
    public List<Laptop> displayAllLaptopDao(){
        // Use TypedQuery to ensure type safety and avoid casting
        TypedQuery<Laptop> query = entityManager.createQuery("SELECT l FROM Laptop l", Laptop.class);
        return query.getResultList();
    }

    // Display All Laptop from Between manufacture Date.
    public List<Laptop> getLaptopsByManufactureDateRangeDao(LocalDate fromDate, LocalDate toDate) {
        return entityManager.createQuery("SELECT l FROM Laptop l WHERE l.mfd BETWEEN :fromDate AND :toDate", Laptop.class)
                .setParameter("fromDate", fromDate)
                .setParameter("toDate", toDate)
                .getResultList();
    }

    // Display All laptops between a price range
    public List<Laptop> getLaptopsByPriceRangeDao(int minPrice, int maxPrice) {
        TypedQuery<Laptop> query = entityManager.createQuery("SELECT l FROM Laptop l WHERE l.price BETWEEN :minPrice AND :maxPrice", Laptop.class);
        query.setParameter("minPrice", minPrice);
        query.setParameter("maxPrice", maxPrice);
        return query.getResultList();
    }

}
