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
import javax.persistence.Lob;
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
@Table(name = "Reponse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reponse.findAll", query = "SELECT r FROM Reponse r"),
    @NamedQuery(name = "Reponse.findByIdReponse", query = "SELECT r FROM Reponse r WHERE r.idReponse = :idReponse"),
    @NamedQuery(name = "Reponse.findByDatePoste", query = "SELECT r FROM Reponse r WHERE r.datePoste = :datePoste"),
    @NamedQuery(name = "Reponse.findByIdUtilisateur", query = "SELECT r FROM Reponse r WHERE r.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "Reponse.findByIdSujet", query = "SELECT r FROM Reponse r WHERE r.idSujet = :idSujet")})
public class Reponse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Reponse")
    private Integer idReponse;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Texte_Reponse")
    private String texteReponse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DatePoste")
    @Temporal(TemporalType.DATE)
    private Date datePoste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Utilisateur")
    private int idUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Sujet")
    private int idSujet;

    public Reponse() {
    }

    public Reponse(Integer idReponse) {
        this.idReponse = idReponse;
    }

    public Reponse(Integer idReponse, String texteReponse, Date datePoste, int idUtilisateur, int idSujet) {
        this.idReponse = idReponse;
        this.texteReponse = texteReponse;
        this.datePoste = datePoste;
        this.idUtilisateur = idUtilisateur;
        this.idSujet = idSujet;
    }

    public Integer getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(Integer idReponse) {
        this.idReponse = idReponse;
    }

    public String getTexteReponse() {
        return texteReponse;
    }

    public void setTexteReponse(String texteReponse) {
        this.texteReponse = texteReponse;
    }

    public Date getDatePoste() {
        return datePoste;
    }

    public void setDatePoste(Date datePoste) {
        this.datePoste = datePoste;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdSujet() {
        return idSujet;
    }

    public void setIdSujet(int idSujet) {
        this.idSujet = idSujet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReponse != null ? idReponse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reponse)) {
            return false;
        }
        Reponse other = (Reponse) object;
        if ((this.idReponse == null && other.idReponse != null) || (this.idReponse != null && !this.idReponse.equals(other.idReponse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.Reponse[ idReponse=" + idReponse + " ]";
    }
    
}
