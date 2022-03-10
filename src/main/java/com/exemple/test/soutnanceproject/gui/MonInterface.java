/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.gui;

import com.exemple.test.soutnanceproject.entities.Personne;
import com.exemple.test.soutnanceproject.services.EvaluationServicesImpl;
import com.exemple.test.soutnanceproject.services.IEvaluationServices;
import java.util.List;

/**
 *
 * @author user
 */
public class MonInterface {
    
    public static void main(String[] args) {
        IEvaluationServices personnes = new EvaluationServicesImpl();        
        for(Personne a : personnes.ListPersonnes()){
            System.out.println("Il y'a "+personnes.ListPersonnes().size()+" dans la base:");
            System.out.println(a.getNom()+" "+ a.getPrenom()+" "+a.getEmailPro());
        }
        
    }
    
}
