/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Aymen Maddouri
 */
public class Enfant {
    
    private String nom;
    private String age;
    private Date dateDeNaissance;
    private String lieuDeNaissance;
    private String adresse;

    

    public Enfant(String nom, String age, Date dateDeNaissance, String lieuDeNaissance, String adresse) {
        this.nom = nom;
        this.age = age;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nom);
        hash = 67 * hash + Objects.hashCode(this.age);
        hash = 67 * hash + Objects.hashCode(this.dateDeNaissance);
        hash = 67 * hash + Objects.hashCode(this.lieuDeNaissance);
        hash = 67 * hash + Objects.hashCode(this.adresse);
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
        final Enfant other = (Enfant) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.lieuDeNaissance, other.lieuDeNaissance)) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.dateDeNaissance, other.dateDeNaissance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enfant{" + "nom=" + nom + ", age=" + age + ", dateDeNaissance=" + dateDeNaissance + ", lieuDeNaissance=" + lieuDeNaissance + ", adresse=" + adresse + '}';
    }
    
    
    
}
