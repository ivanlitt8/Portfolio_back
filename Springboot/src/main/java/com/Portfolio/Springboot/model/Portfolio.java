
package com.Portfolio.Springboot.model;

import jakarta.persistence.Entity;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Portfolio {
    
    private String name;
    private java.sql.Date date_birth;
    private String mail;
    private String about_me;
    private String ubication;

    public Portfolio() {
    }

    public Portfolio(String name, Date date_birth, String mail, String about_me, String ubication) {
        this.name = name;
        this.date_birth = date_birth;
        this.mail = mail;
        this.about_me = about_me;
        this.ubication = ubication;
    }

}
