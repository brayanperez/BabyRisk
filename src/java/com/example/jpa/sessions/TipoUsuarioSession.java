package com.example.jpa.sessions;

import com.example.jpa.entities.TipoUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class TipoUsuarioSession {
      
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create (TipoUsuario tipoUsuario) {
   entityManager.persist(tipoUsuario);
    }
    public void edit (TipoUsuario tipoUsuario){
        entityManager.merge (tipoUsuario);
    }   
    public void remove (TipoUsuario tipoUsuario){
        entityManager.remove (tipoUsuario);
    }
    public List<TipoUsuario> findAll (){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(TipoUsuario.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
    

