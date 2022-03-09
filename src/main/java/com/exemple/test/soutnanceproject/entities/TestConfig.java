/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import com.exemple.test.soutnanceproject.config.DbConfig;
import com.exemple.test.soutnanceproject.entities.Personne;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class TestConfig {
    
    public static void main(String[] args) {
        EntityManager em = DbConfig.getInstance().getEm();

       
        //em.close();
           
    }   
}

