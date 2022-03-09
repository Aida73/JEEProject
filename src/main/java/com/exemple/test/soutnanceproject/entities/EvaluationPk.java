/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Embeddable
public class EvaluationPk implements Serializable {

    private long idMemoire;
    
    private long idEvaluateur;
    
    private Short idElementCompetence;

    public long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(long idMemoire) {
        this.idMemoire = idMemoire;
    }

    public long getIdEvaluateur() {
        return idEvaluateur;
    }

    public void setIdEvaluateur(long idEvaluateur) {
        this.idEvaluateur = idEvaluateur;
    }

    public Short getIdElementCompetence() {
        return idElementCompetence;
    }

    public void setIdElementCompetence(Short idElementCompetence) {
        this.idElementCompetence = idElementCompetence;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.idMemoire ^ (this.idMemoire >>> 32));
        hash = 97 * hash + (int) (this.idEvaluateur ^ (this.idEvaluateur >>> 32));
        hash = 97 * hash + Objects.hashCode(this.idElementCompetence);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EvaluationPk other = (EvaluationPk) obj;
        if (this.idMemoire != other.idMemoire) {
            return false;
        }
        if (this.idEvaluateur != other.idEvaluateur) {
            return false;
        }
        return Objects.equals(this.idElementCompetence, other.idElementCompetence);
    }
    
    
    
    
    
}
