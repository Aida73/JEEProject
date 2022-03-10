/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.services;

import com.exemple.test.soutnanceproject.dao.EvaluationDAOImpl;
import com.exemple.test.soutnanceproject.dao.IEvaluationDAO;
import com.exemple.test.soutnanceproject.entities.Evaluation;
import com.exemple.test.soutnanceproject.entities.Personne;
import java.util.List;

/**
 *
 * @author user
 */
public class EvaluationServicesImpl implements IEvaluationServices{

    @Override
    public List<Evaluation> ListEvaluation() {     
        IEvaluationDAO listEvaluations = new EvaluationDAOImpl();
        return listEvaluations.ListEvaluation();
    } 

    @Override
    public List<Personne> ListPersonnes() {
        IEvaluationDAO listPersonnes = new EvaluationDAOImpl();
        return listPersonnes.ListPersonnes();

    }

    @Override
    public void addEvaluation(Evaluation evaluation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addPersonne(Personne personne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
