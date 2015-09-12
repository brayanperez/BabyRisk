package com.example.jpa.sessions;

import com.example.jpa.entities.Roles;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class RolesSession {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create (Roles roles){
        entityManager.persist(roles);
    }
    public void edit(Roles roles){
        entityManager.merge(roles);
    }
    public void remove(Roles roles){
        entityManager.remove(roles);
    }
    public List<Roles>finAll(){
        CriteriaQuery cq=
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Roles.class));
        return entityManager.createQuery(cq).getResultList();
    }    
}
