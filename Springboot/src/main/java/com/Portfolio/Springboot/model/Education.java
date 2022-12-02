package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String date;
    private String tittle;
    private String description;
    private String img_url;
    private String hiperlink;

    public Education() {
    }

    public Education(int id, String date, String tittle, String description, String img_url, String hiperlink) {
        this.id = id;
        this.date = date;
        this.tittle = tittle;
        this.description = description;
        this.img_url = img_url;
        this.hiperlink = hiperlink;
    }
    
    
    
    
    
}
