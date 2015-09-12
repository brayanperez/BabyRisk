
package com.example.jsf.controllers;

import com.example.jpa.entities.Departamentos;
import com.example.jpa.sessions.DepartamentoSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author steven bolaños
 */

@ManagedBean
@ViewScoped
public class DepartamentoController implements Serializable {
    @EJB 
    private DepartamentoSession DepartamentoSession;
    private Departamentos selecteDepartamentos = null;
    private List <Departamentos> itemsDepartamentos = null;
    
    public Departamentos getSelecteDepartamnetos (){
        if (selecteDepartamentos == null){
            selecteDepartamentos = new Departamentos ();   
        }
       return selecteDepartamentos;
        }
    
    
   
       public void setSelecteDepartamentos (Departamentos selecteDepartamentos){
       this.selecteDepartamentos = selecteDepartamentos;
       }
      
      public DepartamentoSession getDepartamentoSession(){
        return DepartamentoSession;
       } 
      
      public void addDepartamentos(){
      try{
      DepartamentoSession.create(selecteDepartamentos);
      itemsDepartamentos = null;
       } 
      catch(Exception ex){
        System.err.println(ex.getMessage());
         }
        }
     
     public List <Departamentos> getItemsDepartamentos(){
      if(itemsDepartamentos == null){
       try {//
     itemsDepartamentos =getDepartamentoSession().findAll();
     }catch (Exception ex){ //catch = es una alerta
       System.err.println(ex.getMessage());
     }
     }
  return itemsDepartamentos;      
     }
     
   public void create(){
    try{
        getDepartamentoSession().create(selecteDepartamentos);
        
    }catch (Exception ex){
        System.err.printf(ex.getMessage());       
      }
      }

      }
 
  
 

