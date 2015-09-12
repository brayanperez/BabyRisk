
package com.example.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name = "DEPARTAMENTOS")


public class Departamentos implements Serializable{
    
    @Id
    @Column (name = "id_departamento")
    private int idDepartamento;
    
    @Column (name = "nombre_departamento")
    private String nombreDepartamento;
    
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
    @ManyToOne(optional = false)
    private Pais aDeparPais;

    public Departamentos() {
    }

    public Departamentos(int idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getaDeparPais() {
        return aDeparPais;
    }

    public void setaDeparPais(Pais aDeparPais) {
        this.aDeparPais = aDeparPais;
    }

    
}
