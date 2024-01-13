package com.ecommerce.ecom.controller;


import com.ecommerce.ecom.entity.User;
import com.ecommerce.ecom.model.Person;
import com.ecommerce.ecom.repo.PersonRepo;
import com.ecommerce.ecom.repo.UserRepo;
import jakarta.persistence.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MyController {


    private PersonRepo personRepo;
    private UserRepo userRepo;

    public MyController(PersonRepo personRepo,UserRepo userRepo){
        this.personRepo=personRepo;
        this.userRepo = userRepo;
    }


    @RequestMapping("/person")
    public List<Person> getPersons(){

        return this.personRepo.findAll();

    }


   @RequestMapping("/users")
    public List<User> getUsers(){

        return this.userRepo.findAll();
   }





}
