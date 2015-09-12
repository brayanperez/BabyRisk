
package com.example.jsf.controllers;

import com.example.jpa.entities.Pais;
import com.example.jpa.sessions.PaisSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class PaisController implements Serializable{
    
    @EJB
    private PaisSession paisSession;
    private Pais selectePais = null;
    private List<Pais> itemsPais = null;

    public Pais getSelectePais() {
        if (selectePais == null) {
            selectePais = new Pais();
         }
        return selectePais;
    }

    public void setSelectePais(Pais selectePais) {
        this.selectePais = selectePais;
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }
    
    public void create () {
        try {
            paisSession.create(selectePais);
            itemsPais = null;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<Pais> getItemsPais() {
        if (itemsPais == null) {
            try {
                itemsPais = getPaisSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
    
            
        }
        return itemsPais;
    }
    
    







}
   