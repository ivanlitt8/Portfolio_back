
package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String date;
    private String tittle;
    private String description;
    private String img_url;

    public Project() {
    }

    public Project(int id, String date, String tittle, String description, String img_url) {
        this.id = id;
        this.date = date;
        this.tittle = tittle;
        this.description = description;
        this.img_url = img_url;
    }
    
    
    
}
