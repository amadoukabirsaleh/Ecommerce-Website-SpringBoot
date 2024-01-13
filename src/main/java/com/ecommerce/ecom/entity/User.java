package com.ecommerce.ecom.entity;


import com.ecommerce.ecom.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

     @Id
     Long id;

     private String password;
     private String name;
     private UserRole role;
    @Lob
    @Column(columnDefinition = "bytea")
    private byte[] img;

     public User(){}

    public User(Long id, String password, String name, UserRole role, byte[] img) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
        this.img = img;
    }



}
