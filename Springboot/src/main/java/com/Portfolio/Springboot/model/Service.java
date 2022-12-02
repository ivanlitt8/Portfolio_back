
package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Service {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String tittle;
    private String description;
    private String url_logo;

    public Service() {
    }
    
    public Service(int id, String tittle, String description, String url_logo) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.url_logo = url_logo;
    }
    
    
    

    
}
