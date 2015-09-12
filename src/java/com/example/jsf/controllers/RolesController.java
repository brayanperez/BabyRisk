
package com.example.jsf.controllers;

import com.example.jpa.entities.Roles;
import com.example.jpa.sessions.RolesSession;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class RolesController {
    @EJB
    private RolesSession rolesSession;
    private Roles selecteRoles = null;
    private List<Roles> itemRoles = null;

    public Roles getSelecteRoles() {
        if (selecteRoles == null) {
            selecteRoles = new Roles();
            }
        return selecteRoles;
    }

    public void setSelecteRoles(Roles selecteRoles) {
        this.selecteRoles = selecteRoles;
    }

    public RolesSession getRolesSession() {
        return rolesSession;
    }

   
  
    public void create () {
        try {
            rolesSession.create(selecteRoles);
            itemRoles = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    } 
    
    public List<Roles> getItemRoles() {
        if(itemRoles == null){
            try {
                itemRoles = getRolesSession().finAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }   
        }
        return itemRoles;
    }
      
         
}
