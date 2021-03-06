/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rod
 */
@Entity
@Table(name="DISTANCE")
public class Distance  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "LOCALISATION", referencedColumnName = "LOCALISATIONNO")
    private Localisation localisation;
    
    @JoinColumn(name="ARRIVEE")
    private Localisation arrivee;
    
    @Column(name="DISTANCE")
    private Integer distance;
    
    public Distance() {
    }

    public Distance(Localisation arrivee, Integer distance) {
        this.arrivee = arrivee;
        this.distance = distance;
    }

    public Localisation getArrivee() {
        return arrivee;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Distance other = (Distance) obj;
        if (!Objects.equals(this.arrivee, other.arrivee)) {
            return false;
        }
        if (!Objects.equals(this.distance, other.distance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Distance{" + "arrivee=" + arrivee + ", distance=" + distance + '}';
    }

}
