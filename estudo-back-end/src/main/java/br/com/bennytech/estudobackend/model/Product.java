package br.com.bennytech.estudobackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    
    @Id  //vai tranformar essa coluna em primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String name;
    private Integer quantit;
    private Double price;
    private String note;

   //#region
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantit() {
        return quantit;
    }

    public void setQuantit(Integer quantit) {
        this.quantit = quantit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
     ////#region
    

}
