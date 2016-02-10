/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yannick
 */
@Entity
@Table(name = "Sujet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sujet.findAll", query = "SELECT s FROM Sujet s"),
    @NamedQuery(name = "Sujet.findByIdSujet", query = "SELECT s FROM Sujet s WHERE s.idSujet = :idSujet"),
    @NamedQuery(name = "Sujet.findByTitreSujet", query = "SELECT s FROM Sujet s WHERE s.titreSujet = :titreSujet"),
    @NamedQuery(name = "Sujet.findByDateCreation", query = "SELECT s FROM Sujet s WHERE s.dateCreation = :dateCreation"),
    @NamedQuery(name = "Sujet.findByIdUtilisateur", query = "SELECT s FROM Sujet s WHERE s.idUtilisateur = :idUtilisateur")})
public class Sujet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Sujet")
    private Integer idSujet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Titre_Sujet")
    private String titreSujet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Utilisateur")
    private int idUtilisateur;

    public Sujet() {
    }

    public Sujet(Integer idSujet) {
        this.idSujet = idSujet;
    }

    public Sujet(Integer idSujet, String titreSujet, Date dateCreation, int idUtilisateur) {
        this.idSujet = idSujet;
        this.titreSujet = titreSujet;
        this.dateCreation = dateCreation;
        this.idUtilisateur = idUtilisateur;
    }

    public Integer getIdSujet() {
        return idSujet;
    }

    public void setIdSujet(Integer idSujet) {
        this.idSujet = idSujet;
    }

    public String getTitreSujet() {
        return titreSujet;
    }

    public void setTitreSujet(String titreSujet) {
        this.titreSujet = titreSujet;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSujet != null ? idSujet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sujet)) {
            return false;
        }
        Sujet other = (Sujet) object;
        if ((this.idSujet == null && other.idSujet != null) || (this.idSujet != null && !this.idSujet.equals(other.idSujet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.Sujet[ idSujet=" + idSujet + " ]";
    }
    
}
