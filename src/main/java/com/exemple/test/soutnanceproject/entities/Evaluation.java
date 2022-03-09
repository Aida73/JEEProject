/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author user
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Evaluation.findAll", query = "SELECT e FROM Evaluation e")
})
public class Evaluation implements Serializable {

    @EmbeddedId
    private EvaluationPk evaluationPk;
    
    @ManyToOne
    @MapsId("IdEvaluateur")
    private Evaluateur evaluateur;
    
    
    @ManyToOne
    @MapsId("idMemoire")
    private Memoire memoire;
    
    @ManyToOne
    @MapsId("IdElementCompetence")
    private Element_Competence elementCompetence;
    
    
    
    private Short note;
    
    
    private String commentaire;

    public EvaluationPk getEvaluationPk() {
        return evaluationPk;
    }

    public void setEvaluationPk(EvaluationPk evaluationPk) {
        this.evaluationPk = evaluationPk;
    }

    public Evaluateur getEvaluateur() {
        return evaluateur;
    }

    public void setEvaluateur(Evaluateur evaluateur) {
        this.evaluateur = evaluateur;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    public Element_Competence getElementCompetence() {
        return elementCompetence;
    }

    public void setElementCompetence(Element_Competence elementCompetence) {
        this.elementCompetence = elementCompetence;
    }

    public Short getNote() {
        return note;
    }

    public void setNote(Short note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.evaluationPk);
        hash = 47 * hash + Objects.hashCode(this.evaluateur);
        hash = 47 * hash + Objects.hashCode(this.memoire);
        hash = 47 * hash + Objects.hashCode(this.elementCompetence);
        hash = 47 * hash + Objects.hashCode(this.note);
        hash = 47 * hash + Objects.hashCode(this.commentaire);
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
        final Evaluation other = (Evaluation) obj;
        if (!Objects.equals(this.commentaire, other.commentaire)) {
            return false;
        }
        if (!Objects.equals(this.evaluationPk, other.evaluationPk)) {
            return false;
        }
        if (!Objects.equals(this.evaluateur, other.evaluateur)) {
            return false;
        }
        if (!Objects.equals(this.memoire, other.memoire)) {
            return false;
        }
        if (!Objects.equals(this.elementCompetence, other.elementCompetence)) {
            return false;
        }
        return Objects.equals(this.note, other.note);
    }
    
    
    
    
    
}
