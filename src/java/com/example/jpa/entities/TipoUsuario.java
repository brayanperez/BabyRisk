
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "TIPO_DE_USUARIO")

public class TipoUsuario implements Serializable{
    
 @Id
 @Column (name = "id_tipo_usuario")
 private String idTipoUsuario;
 
 @Column (name = "nombre_usuario")
 private String nombreUsuario;
 
 @OneToMany(mappedBy = "idTipoUsuario")
 private List<Usuario> listTipUUsu;

    public TipoUsuario() {
    }

    public TipoUsuario(String idTipoUsuario, String nombreUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(String idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<Usuario> getListTipUUsu() {
        return listTipUUsu;
    }

    public void setListTipUUsu(List<Usuario> listTipUUsu) {
        this.listTipUUsu = listTipUUsu;
    }

 
 
 
}
