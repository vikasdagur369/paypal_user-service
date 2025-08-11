package com.paypal.user_service.entity;


import jakarta.persistence.*;

@Entity
// entity annotation tells springboot that instance of this class is intended to used in relational database.

@Table(name = "app user") // it tells the table name.
public class User {


@Id //it declares the primary key.

@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;


    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }



}
