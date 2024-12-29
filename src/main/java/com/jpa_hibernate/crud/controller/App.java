package com.jpa_hibernate.crud.controller;

import com.jpa_hibernate.crud.entity.Laptop;
import com.jpa_hibernate.crud.service.LaptopService;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        LaptopService service = new LaptopService();

        // insert
//        Laptop laptop = new Laptop("HP","Silver",76000,LocalDate.parse("2001-10-10"));
//        int id = service.InsertLaptopService(laptop);
//        System.out.println("id of insert element which is dynamic: "+id);


        // delete
//        System.out.println(service.deleteLaptopService(24033455));


        // update
//        System.out.println(service.updateLaptopService(24033361,"HP","red",120000,"2024-10-10"));


        // Display By Id
//        System.out.println(service.displayLaptopByIdService(24103019));


        // Display All Laptop
//        List<Laptop> laptopList= service.displayAllLaptopService();
//        for (Laptop laptop :laptopList){
//            System.out.println(laptop);
//        }

        // Display All Laptop by Color
//        List<Laptop> laptopList1 = service.displayLaptopByColorService("blue");
//        for (Laptop laptop:laptopList1){
//            System.out.println(laptop);
//        }

        // Display Laptop In Between Date from and to.
//        List<Laptop> laptopList = service.getLaptopsByManufactureDateRangeService("2002-10-10","2029-12-12");
//        for (Laptop laptop : laptopList){
//            System.out.println(laptop.getName());
//        }

        // Display Laptop in between Price range
//        try {
//            List<Laptop> laptopList = service.getLaptopsByPriceRangeService(5000, 100000);
//            laptopList.forEach(System.out::println);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage()); // If any error occurs, it will print the message.
//        }

        // Display Laptop by Name or company name
//        try {
//            List<Laptop> laptopList = service.getLaptopsByNameService("Hp");
//            laptopList.forEach(System.out::println);
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

//        // Display Laptop by price in accenting order
//        List<Laptop> laptopList = service.getLaptopsSortedByPriceAscendingService();
//        for (Laptop laptop:laptopList){
//            System.out.println(laptop);
//        }

        // Display Laptop by price in descending order
//        List<Laptop> laptopList = service.getLaptopsSortedByPriceDescendingService();
//        for (Laptop laptop:laptopList){
//            System.out.println(laptop);
//        }

        // Display All Laptops Sorted by Name (Ascending Order)
//        List<Laptop> laptopList1 = service.getLaptopsSortedByNameAscendingService();
//        List<Laptop> laptopList2 = service.getLaptopsSortedByNameDescendingService();
//        List<Laptop> laptopList3 = service.getLaptopsSortedByManufactureDateAscendingService();
//        List<Laptop> laptopList4 = service.getLaptopsSortedByManufactureDateDescendingService();
//        for (Laptop laptop:laptopList4){
//            System.out.println(laptop);
//        }
    }
}
