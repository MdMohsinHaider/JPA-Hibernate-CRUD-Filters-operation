package com.jpa_hibernate.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop implements Serializable {
    @Id
    private int id;
    private String name;
    private String color;
    private int price;
    @Column
    private LocalDate mfd;

    // Custom constructor without ID
    public Laptop(String name, String color, int price, LocalDate mfd) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.mfd = mfd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && price == laptop.price && Objects.equals(name, laptop.name) && Objects.equals(color, laptop.color) && Objects.equals(mfd, laptop.mfd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price, mfd);
    }
}
