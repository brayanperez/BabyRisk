/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author adsi
 */

@Entity
@Table (name = "REGIMEN")

public class Regimen implements Serializable{
    @Id
    @Column (name = "id_regimen")
    private String idRegimen;
    
    @Column (name = "nombre_regimen")
    private String nombreRegimen;
    
    @OneToMany (mappedBy = "idRegimen")
    private List<Usuario> listRegUsu;

    public Regimen() {
    }

    public Regimen(String idRegimen, String nombreRegimen) {
        this.idRegimen = idRegimen;
        this.nombreRegimen = nombreRegimen;
    }

    public String getIdRegimen() {
        return idRegimen;
    }

    public void setIdRegimen(String idRegimen) {
        this.idRegimen = idRegimen;
    }

    public String getNombreRegimen() {
        return nombreRegimen;
    }

    public void setNombreRegimen(String nombreRegimen) {
        this.nombreRegimen = nombreRegimen;
    }
    
   
    
    
}
