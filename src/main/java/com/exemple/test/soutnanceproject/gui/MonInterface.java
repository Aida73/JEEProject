/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.gui;

import com.exemple.test.soutnanceproject.services.EvaluationServicesImpl;
import com.exemple.test.soutnanceproject.services.IEvaluationServices;

/**
 *
 * @author user
 */
public class MonInterface {
    
    public static void main(String[] args) {
        IEvaluationServices personnes = new EvaluationServicesImpl();
        System.out.println("l'ensemble des personnes "+personnes.ListPersonnes());
    }
    
}
