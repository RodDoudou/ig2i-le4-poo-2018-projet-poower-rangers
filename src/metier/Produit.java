/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Rod
 */
@Entity
@Table(name="PRODUIT")
public class Produit  implements Serializable{
    @Id
    @Column(name="PRODUITNO")
    private int id;
    
    @Column(name="POIDS")
    private int poids;
    
    @Column(name="VOLUME")
    private int volume;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="LOCALISATION", referencedColumnName ="LOCALISATIONNO")
    private Localisation localisation;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "ENTREPOT", referencedColumnName = "ENTREPOTNO")
    private Entrepot entrepot;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "QUANTITEPRODUIT", referencedColumnName = "ID")
    private QuantiteProduit quantiteProduit;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "COLIS", referencedColumnName = "COLISNO")
    private Colis colis;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "INSTANCE", referencedColumnName = "INSTANCENO")
    private Instance instance;
    
    public Produit() {
    }

    public Produit(int id, int poids, int volume, Localisation localisation) {
        this.id = id;
        if(poids < 0){
            this.poids = 0;
        }
        else{
            this.poids = poids;
        }
        if(volume < 0){
            this.volume = 0;
        }
        else{
            this.volume = volume;
        }
	if(localisation!=null){
	    this.localisation=localisation;
	}
	else{
	    this.localisation = new Localisation();
	}
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Produit other = (Produit) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.poids != other.poids) {
            return false;
        }
        if (this.volume != other.volume) {
            return false;
        }
        return true;
    }

    public int getId() {
	return id;
    }

    public int getPoids() {
	return poids;
    }

    public int getVolume() {
	return volume;
    }

    public Localisation getLocalisation() {
	return localisation;
    }

    @Override
    public String toString() {
        return "\t\t\tProduit{" + "id=" + id + ", poids=" + poids + ", volume=" + volume + "Localisation=" + localisation + '}'+ "\n";
    }
    
    
    
}
