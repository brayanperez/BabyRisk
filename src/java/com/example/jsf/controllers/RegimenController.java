
package com.example.jsf.controllers;

import com.example.jpa.entities.Regimen;
import com.example.jpa.sessions.RegimenSession;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class RegimenController {
    
    @EJB
    private RegimenSession regimenSession;
    private Regimen selecteRegimen = null;
    private List<Regimen> itemsRegimen = null;
    
     public Regimen getSelecteRegimen() {
        if (selecteRegimen == null) {
            selecteRegimen = new Regimen();
         }
        return selecteRegimen;
    }

    public void setSelecteRegimen(Regimen selecteRegimen) {
        this.selecteRegimen = selecteRegimen;
    }

    public RegimenSession getRegimenSession() {
        return regimenSession;
    }
    
    public void create () {
        try {
           regimenSession.create(selecteRegimen);
            itemsRegimen = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<Regimen> getItemsRegimen() {
        if (itemsRegimen == null) {
            try {
                itemsRegimen = getRegimenSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
    
            
        }
        return itemsRegimen;
    }
    

    
    
    
}
    

