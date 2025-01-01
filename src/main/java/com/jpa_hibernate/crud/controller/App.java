package com.jpa_hibernate.crud.controller;

import com.jpa_hibernate.crud.entity.Laptop;
import com.jpa_hibernate.crud.lib.PrintCode;
import com.jpa_hibernate.crud.service.LaptopService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        LaptopService service = new LaptopService();
        Scanner scanner = new Scanner(System.in);
        PrintCode pc = new PrintCode(scanner);


        switch (pc.getOption()){
            case 1: {
                // insert
                scanner.nextLine();
                System.out.print("Enter Name : ");
                String name = scanner.nextLine();
                System.out.print("Enter color : ");
                String color = scanner.nextLine();
                System.out.print("Enter price : ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter mfd : ");
                String mfd = scanner.nextLine();
                Laptop laptop = new Laptop(name,color,price,LocalDate.parse(mfd));
                int id = service.InsertLaptopService(laptop);
                System.out.println("id of insert element which is dynamic: "+id);
            }
            break;

            case 2:{
                // delete by Id
                System.out.print("Enter Laptop Product Id :");
                int laptop_product_id = scanner.nextInt();
                System.out.print(service.deleteLaptopService(laptop_product_id));
                break;
            }
            case 3:{
                // update by id
                System.out.print("Enter Laptop Product Id :");
                int laptop_product_id = scanner.nextInt();
                System.out.println(service.displayLaptopByIdService(laptop_product_id)+"\n\n");
                scanner.nextLine();
                System.out.print("Enter Name : ");
                String name = scanner.nextLine();
                System.out.print("Enter color : ");
                String color = scanner.nextLine();
                System.out.print("Enter price : ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter mfd : ");
                String mfd = scanner.nextLine();
                System.out.println(service.updateLaptopService(laptop_product_id,name,color,price,mfd));
                break;
            }
            case 4:{
                // Display By Id
                System.out.print("Enter Laptop Product Id :");
                int laptop_product_id = scanner.nextInt();
                System.out.println(service.displayLaptopByIdService(laptop_product_id));
                break;
            }
            case 5:{
                // Display All Laptop
                List<Laptop> laptopList= service.displayAllLaptopService();
                for (Laptop laptop :laptopList){
                    System.out.println(laptop);
                }
                break;
            }
            case 6:{
                // Display All Laptop by Color
                System.out.print("Enter Laptop color :");
                String laptop_color = scanner.next();
                List<Laptop> laptopList1 = service.displayLaptopByColorService(laptop_color);
                for (Laptop laptop:laptopList1){
                    System.out.println(laptop);
                }
                break;
            }
            case 7:{
                // Display Laptop In Between Date from and to.
                System.out.print("From Date");
                scanner.nextLine();
                String from = scanner.nextLine();
                System.out.print("to Date");
                String to = scanner.nextLine();
                List<Laptop> laptopList = service.getLaptopsByManufactureDateRangeService(from,to);
                for (Laptop laptop : laptopList){
                    System.out.println(laptop.getName());
                }
                break;
            }
            case 8:{
                // Display Laptop in between Price range
                System.out.print("Enter min Price : ");
                int min = scanner.nextInt();
                System.out.print("Enter max Price : ");
                int max = scanner.nextInt();
                try {
                    List<Laptop> laptopList = service.getLaptopsByPriceRangeService(min,max);
                    laptopList.forEach(System.out::println);
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage()); // If any error occurs, it will print the message.
                }
                break;
            }
            case 9:{
                // Display Laptop by Name or company name
                scanner.nextLine();
                System.out.print("Enter Name : ");
                String name = scanner.nextLine();
                try {
                    List<Laptop> laptopList = service.getLaptopsByNameService(name);
                    laptopList.forEach(System.out::println);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 10:{
                // Display Laptop by price in accenting order
                List<Laptop> laptopList = service.getLaptopsSortedByPriceAscendingService();
                for (Laptop laptop:laptopList){
                    System.out.println(laptop);
                }
                break;
            }
            case 11:{
                // Display Laptop by price in descending order
                List<Laptop> laptopList = service.getLaptopsSortedByPriceDescendingService();
                for (Laptop laptop:laptopList){
                    System.out.println(laptop);
                }
                break;
            }
            case 12:{
                // Display All Laptops Sorted by Name (Ascending Order)
                List<Laptop> laptopList1 = service.getLaptopsSortedByNameAscendingService();
                for (Laptop laptop:laptopList1){
                    System.out.println(laptop);
                }
                break;
            }
            case 13:{
                // Display All Laptops Sorted by Name (Descending Order)
                List<Laptop> laptopList2 = service.getLaptopsSortedByNameDescendingService();
                for (Laptop laptop:laptopList2){
                    System.out.println(laptop);
                }
                break;
            }
            case 14:{
                // Display All Laptops Sorted by ManufactureDate (Ascending Order)
                List<Laptop> laptopList3 = service.getLaptopsSortedByManufactureDateAscendingService();
                for (Laptop laptop:laptopList3){
                    System.out.println(laptop);
                }
                break;
            }
            case 15:{
                // Display All Laptops Sorted by ManufactureDate (Descending Order)
                List<Laptop> laptopList4 = service.getLaptopsSortedByManufactureDateDescendingService();
                for (Laptop laptop:laptopList4){
                    System.out.println(laptop);
                }
                break;
            }
            default:{
                System.err.print("Wrong Option");
                System.exit(0);
            }

        }























//




//
//
//
//

    }
}
