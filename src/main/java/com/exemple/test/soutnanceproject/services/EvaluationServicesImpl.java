/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.services;

import com.exemple.test.soutnanceproject.config.DbConfig;
import com.exemple.test.soutnanceproject.dao.EvaluationDAOImpl;
import com.exemple.test.soutnanceproject.dao.IEvaluationDAO;
import com.exemple.test.soutnanceproject.entities.Evaluation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class EvaluationServicesImpl implements IEvaluationServices{
     IEvaluationDAO evaluation = new EvaluationDAOImpl();
        

    @Override
    public List<Evaluation> MalistEvaluations() {
        
        return evaluation.ListEvaluation();     
    }
    

    @Override
    public void addEvaluation(Evaluation evaluation) {
        
    }
    
}
