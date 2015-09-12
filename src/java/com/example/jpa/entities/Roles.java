
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles implements Serializable{
    @Id
    @Column(name = "id_rol")
    private String idRol;
    
    @Column(name = "nombre_rol")
    private String nombre;
    
     @OneToMany(mappedBy = "idRol")
    private List<Usuario> listRolUsu;

    public Roles() {
    }

    public Roles(String idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getListRolUsu() {
        return listRolUsu;
    }

    public void setListRolUsu(List<Usuario> listRolUsu) {
        this.listRolUsu = listRolUsu;
    }

    
     
}
