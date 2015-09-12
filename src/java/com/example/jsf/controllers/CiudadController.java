
package com.example.jsf.controllers;

import com.example.jpa.entities.Ciudad;
import com.example.jpa.sessions.CiudadSession;
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

public class CiudadController implements Serializable {
    
  @EJB
  private CiudadSession CiudadSession;
  private Ciudad selecteCiudad = null;
  private List <Ciudad> itemsCiudad = null;
  
  
  public Ciudad getSelecteCiudad () {
      if (selecteCiudad == null) {
          selecteCiudad = new Ciudad ();
          
      }
      return selecteCiudad;
      }
   public void setselecteCiudad (Ciudad selecteCiudad){
       this.selecteCiudad = selecteCiudad;
      }
   
   public CiudadSession getCiudadSession (){
       return CiudadSession;
   }
   
   
    public void addCiudad (){
        try {
            CiudadSession.create(selecteCiudad);
            itemsCiudad = null;
        } catch (Exception ex){
            System.out.println(ex.getMessage ());
        }
    }
      public List<Ciudad> getItemCiudad() {
        if (itemsCiudad == null){
            try {
                itemsCiudad = getCiudadSession().findAll();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return itemsCiudad;
    }    
       
           
        }
    

  
  
    
    

