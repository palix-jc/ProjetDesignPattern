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
@Table(name = "Utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByIdUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByPseudoUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.pseudoUtilisateur = :pseudoUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByMdpUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.mdpUtilisateur = :mdpUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByEmailUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.emailUtilisateur = :emailUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByImageUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.imageUtilisateur = :imageUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByDateNaisUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.dateNaisUtilisateur = :dateNaisUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByNomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.nomUtilisateur = :nomUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByPrenomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.prenomUtilisateur = :prenomUtilisateur")})
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id

    @NotNull
    @Column(name = "Id_Utilisateur")
    private Integer idUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Pseudo_Utilisateur")
    private String pseudoUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Mdp_Utilisateur")
    private String mdpUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email_Utilisateur")
    private String emailUtilisateur;
    @Size(max = 100)
    @Column(name = "Image_Utilisateur")
    private String imageUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateNais_Utilisateur")
    @Temporal(TemporalType.DATE)
    private Date dateNaisUtilisateur;
    @Size(max = 20)
    @Column(name = "Nom_Utilisateur")
    private String nomUtilisateur;
    @Size(max = 20)
    @Column(name = "Prenom_Utilisateur")
    private String prenomUtilisateur;

    public Utilisateur() {
    }

    public Utilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Utilisateur(Integer idUtilisateur, String pseudoUtilisateur, String mdpUtilisateur, String emailUtilisateur, Date dateNaisUtilisateur) {
        this.idUtilisateur = idUtilisateur;
        this.pseudoUtilisateur = pseudoUtilisateur;
        this.mdpUtilisateur = mdpUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
        this.dateNaisUtilisateur = dateNaisUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPseudoUtilisateur() {
        return pseudoUtilisateur;
    }

    public void setPseudoUtilisateur(String pseudoUtilisateur) {
        this.pseudoUtilisateur = pseudoUtilisateur;
    }

    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }

    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }

    public String getEmailUtilisateur() {
        return emailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
    }

    public String getImageUtilisateur() {
        return imageUtilisateur;
    }

    public void setImageUtilisateur(String imageUtilisateur) {
        this.imageUtilisateur = imageUtilisateur;
    }

    public Date getDateNaisUtilisateur() {
        return dateNaisUtilisateur;
    }

    public void setDateNaisUtilisateur(Date dateNaisUtilisateur) {
        this.dateNaisUtilisateur = dateNaisUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtilisateur != null ? idUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idUtilisateur == null && other.idUtilisateur != null) || (this.idUtilisateur != null && !this.idUtilisateur.equals(other.idUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.Utilisateur[ idUtilisateur=" + idUtilisateur + " ]";
    }
    
}
