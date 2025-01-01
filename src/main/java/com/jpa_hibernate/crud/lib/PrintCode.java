package com.jpa_hibernate.crud.lib;


import java.util.Scanner;

final public class PrintCode {

    private byte op;

    public PrintCode() {
        super();
    }

    public PrintCode(byte op) {
        this.op = op;
    }

    public PrintCode(Scanner scanner) {

        final String option_1 = "1. Insert new Laptop";
        String option_2 = "2. Delete by Id";
        String option_3 = "3. Update by Id";
        String option_4 = "4. Display By Id";
        String option_5 = "5. Display All Laptop";
        String option_6 = "6. Display All Laptop by Color";
        String option_7 = "7. Display Laptop In Between Date from and to.";
        String option_8 = "8. Display Laptop in between Price range";
        String option_9 = "9. Display Laptop by Name or company name";
        String option_10 = "10. Display Laptop by price in accenting order";
        String option_11 = "11. Display Laptop by price in descending order";
        String option_12 = "12. Display All Laptops Sorted by Name (Ascending Order)";
        String option_13 = "13. Display All Laptops Sorted by Name (Descending Order)";
        String option_14 = "14. Display All Laptops Sorted by ManufactureDate (Ascending Order)";
        String option_15 = "15. Display All Laptops Sorted by ManufactureDate (Descending Order)";

        System.out.println("Enter your Number Choose the Operation Performed:\n"
                +option_1+"\n"
                +option_2+"\n"
                +option_3+"\n"
                +option_4+"\n"
                +option_5+"\n"
                +option_6+"\n"
                +option_7+"\n"
                +option_8+"\n"
                +option_9+"\n"
                +option_10+"\n"
                +option_11+"\n"
                +option_12+"\n"
                +option_13+"\n"
                +option_14+"\n"
                +option_15+"\n"
                +"Enter : "
        );
        op = scanner.nextByte();
    }
    public byte getOption(){
        return op;
    }
}
