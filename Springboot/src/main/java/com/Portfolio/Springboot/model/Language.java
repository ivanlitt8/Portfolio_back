
package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lang;
    private String level;

    public Language() {
    }

    public Language(int id, String lang, String level) {
        this.id = id;
        this.lang = lang;
        this.level = level;
    }
    
}
