
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name = "CIUDADES")
@IdClass (value = CiudadPK.class)


public class Ciudad implements Serializable{
    
    @Id 
    @Column (name = "id_ciudad")
    private int idCiudad;
    
    @Id
    @ManyToOne
    @JoinColumn (name = "id_departamento")
    private Departamentos idDepartamento;
    
    
    @Column (name = "nombre_ciudad")
    private String nombreCiudad;
    
    @OneToMany(mappedBy = "idCiudad")
    private List<Usuario> listCiuUsu;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, Departamentos idDepartamento, String nombreCiudad) {
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
        this.nombreCiudad = nombreCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public List<Usuario> getListCiuUsu() {
        return listCiuUsu;
    }

    public void setListCiuUsu(List<Usuario> listCiuUsu) {
        this.listCiuUsu = listCiuUsu;
    }

   
    
    
}
