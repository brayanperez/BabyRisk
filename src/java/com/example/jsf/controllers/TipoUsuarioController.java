
package com.example.jsf.controllers;


import com.example.jpa.entities.TipoUsuario;
import com.example.jpa.sessions.TipoUsuarioSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TipoUsuarioController implements Serializable{
    @EJB
    
    private TipoUsuarioSession tipoUsuarioSession;
    private TipoUsuario selecteTipoUsuario = null;
    private List<TipoUsuario> itemTipoUsuarios = null;

    public TipoUsuarioSession getTipoUsuarioSession() {
        return tipoUsuarioSession;
    }

   
    public void create () {
        try {
            tipoUsuarioSession.create(selecteTipoUsuario);
            itemTipoUsuarios = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    } 

    
   
    public TipoUsuario getSelecteTipoUsuario() {
        if(selecteTipoUsuario == null){
           selecteTipoUsuario = new TipoUsuario();
                 
                   }         
        return selecteTipoUsuario;
    }

    public void setSelecteTipoUsuario(TipoUsuario selecteTipoUsuario) {
        this.selecteTipoUsuario = selecteTipoUsuario;
    }

    public List<TipoUsuario> getItemTipoUsuarios() {
        if(itemTipoUsuarios == null)
            try{
                itemTipoUsuarios = getTipoUsuarioSession().findAll();
            }catch (Exception ex){
                System.err.println(ex.getMessage());
            }
        return itemTipoUsuarios;
    }

   
    }
      
          
         

     