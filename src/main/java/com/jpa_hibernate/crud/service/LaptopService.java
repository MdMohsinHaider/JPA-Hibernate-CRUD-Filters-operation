package com.jpa_hibernate.crud.service;

import com.jpa_hibernate.crud.dao.LaptopDao;
import com.jpa_hibernate.crud.entity.Laptop;
import com.jpa_hibernate.crud.lib.ServiceHelper;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class LaptopService {
    LaptopDao dao = new LaptopDao();
    ServiceHelper sH = new ServiceHelper();

    // insert laptop
    public int InsertLaptopService(Laptop laptop){
        if (laptop.getId() ==0)laptop.setId(sH.getRandomIdAsInt());
        dao.InsertLaptopDao(laptop);
        return laptop.getId();
    }

    // delete Laptop
    public String deleteLaptopService(int id){
        if (id <= 0) return "Not Valid Id !!...";
        dao.deleteLaptopDao(id);
        return "Successful delete Laptop id : "+id;
    }

    // update Laptop
    public String updateLaptopService(int id, String name,String color,int price, String mfd){
        if (id <= 0) return "Not Valid Id !!...";
        dao.updateLaptopDao(id,name,color,price,mfd);
        return "Successful update Laptop id : "+id;
    }

    // Display Laptop by id.
    public Laptop displayLaptopByIdService(int id){
        if (id <= 0) return null;
        return dao.displayLaptopByIdDao(id);
    }


    // Display All Laptop
    public List<Laptop> displayAllLaptopService(){
        return dao.displayAllLaptopDao();
    }

    // Display All Laptop by Color
    public List<Laptop> displayLaptopByColorService(String color){
        if (color == null || color.isEmpty()) return null;
        return dao.displayLaptopByColorDao(color);
    }

    // Display All Laptop by name or company name
    public List<Laptop> getLaptopsByNameService(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Laptop name cannot be null or empty");
        }
        return dao.getLaptopsByNameDao(name);
    }

    // Display All Laptop from Between manufacture Date.
    public List<Laptop> getLaptopsByManufactureDateRangeService(String fromDate, String toDate) {
        if (fromDate == null && toDate == null) return null;
        if (!(ServiceHelper.isValidDateFormat(fromDate) && ServiceHelper.isValidDateFormat(toDate))) return null;
        assert fromDate != null;
        LocalDate  from_date=LocalDate.parse(fromDate);
        LocalDate to_date = LocalDate.parse(toDate);
        return dao.getLaptopsByManufactureDateRangeDao(from_date,to_date);
    }

    // Display All laptops between a price range
    public List<Laptop> getLaptopsByPriceRangeService(int minPrice, int maxPrice) {
        sH.validatePriceRange(minPrice,maxPrice);
        return dao.getLaptopsByPriceRangeDao(minPrice,maxPrice);
    }

 // Filter method 🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️🏳️

    // Display All Laptops Sorted by Price (Ascending Order) using Collections
    public List<Laptop> getLaptopsSortedByPriceAscendingService() {
        List<Laptop> laptopList = dao.displayAllLaptopDao();
        laptopList.sort(Comparator.comparingInt(Laptop::getPrice));  // Sorting by price in ascending order
        return laptopList;
    }

    // Display All Laptops Sorted by Price (Descending Order)
    public List<Laptop> getLaptopsSortedByPriceDescendingService() {
        List<Laptop> laptops = dao.displayAllLaptopDao();
        laptops.sort(Comparator.comparingInt(Laptop::getPrice).reversed()); // Descending order
        return laptops;
    }

    // Display All Laptops Sorted by Name (Ascending Order)
    public List<Laptop> getLaptopsSortedByNameAscendingService() {
        List<Laptop> laptops = dao.displayAllLaptopDao();
        laptops.sort(Comparator.comparing(Laptop::getName)); // Ascending order by name
        return laptops;
    }

    // Display All Laptops Sorted by Name (Descending Order)
    public List<Laptop> getLaptopsSortedByNameDescendingService() {
        List<Laptop> laptops = dao.displayAllLaptopDao();
        laptops.sort(Comparator.comparing(Laptop::getName).reversed()); // Descending order by name
        return laptops;
    }

    // Display All Laptops Sorted by Manufacture Date (Ascending Order)
    public List<Laptop> getLaptopsSortedByManufactureDateAscendingService() {
        List<Laptop> laptops = dao.displayAllLaptopDao();
        laptops.sort(Comparator.comparing(Laptop::getMfd)); // Ascending order by manufacture date
        return laptops;
    }

    // Display All Laptops Sorted by Manufacture Date (Descending Order)
    public List<Laptop> getLaptopsSortedByManufactureDateDescendingService() {
        List<Laptop> laptops = dao.displayAllLaptopDao();
        laptops.sort(Comparator.comparing(Laptop::getMfd).reversed()); // Descending order by manufacture date
        return laptops;
    }

}
