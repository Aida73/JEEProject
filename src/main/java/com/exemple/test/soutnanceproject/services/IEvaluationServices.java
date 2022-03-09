/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemple.test.soutnanceproject.services;

import com.exemple.test.soutnanceproject.entities.Evaluation;
import java.util.List;

/**
 *
 * @author user
 */
public interface IEvaluationServices {
    
    public List<Evaluation> MalistEvaluations(); 
    
    public void addEvaluation(Evaluation evaluation);
       
}
