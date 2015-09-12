/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;

import com.example.jpa.entities.Regimen;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi
 */
@Stateless
public class RegimenSession {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create (Regimen regimen) {
        entityManager.persist(regimen);
    }
    public void edit (Regimen regimen){
        entityManager.merge (regimen);
    }  
    public void remove (Regimen regimen){
        entityManager.remove (regimen);
    }
    public List<Regimen> findAll (){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Regimen.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
