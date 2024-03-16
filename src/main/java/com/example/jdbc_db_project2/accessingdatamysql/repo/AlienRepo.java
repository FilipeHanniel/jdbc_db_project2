package com.example.jdbc_db_project2.accessingdatamysql.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.jdbc_db_project2.accessingdatamysql.model.Alien;

@Repository
public class AlienRepo {
    
    public void save(Alien alien){
        System.out.println("added");
    }

    public List<Alien> findAll(){
        return new ArrayList<Alien>();
    }

}
