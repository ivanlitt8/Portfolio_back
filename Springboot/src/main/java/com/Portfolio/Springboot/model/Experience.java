
package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String start;
    private java.sql.Date end;
    private String tittle;
    private String place;
    private String description;
    private int is_actual;

    public Experience() {
    }

    public Experience(int id, String start, Date end, String tittle, String place, String description, int is_actual, int type_experience_id) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.tittle = tittle;
        this.place = place;
        this.description = description;
        this.is_actual = is_actual;
    }
    
    
    
    
    
    
}
