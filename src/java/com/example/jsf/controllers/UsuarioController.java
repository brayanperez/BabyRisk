package com.example.jsf.controllers;


import com.example.jpa.entities.Usuario;
import com.example.jpa.sessions.UsuarioSession;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class UsuarioController {
    @EJB
    private UsuarioSession usuarioSession;
    private Usuario selecteUsuario = null;
    private List<Usuario> itemUsuario = null;

    public Usuario getSelecteUsuario() {
        if (selecteUsuario == null) {
            selecteUsuario = new Usuario();
            }
        return selecteUsuario;
    }

    public void setSelecteUsuario(Usuario selecteUsuario) {
        this.selecteUsuario = selecteUsuario;
    }

    public UsuarioSession getUsuarioSession() {
        return usuarioSession;
    }

   
  
    public void create () {
        try {
            usuarioSession.create(selecteUsuario);
            itemUsuario = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    } 
    
    public List<Usuario> getItemUsuario() {
        if(itemUsuario == null){
            try {
                itemUsuario = getUsuarioSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }   
        }
        return itemUsuario;
    }
      
         
}

