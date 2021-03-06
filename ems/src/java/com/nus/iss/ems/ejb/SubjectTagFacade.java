/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nus.iss.ems.ejb;

import com.nus.iss.ems.entities.SubjectTag;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Milan
 */
@Stateless
public class SubjectTagFacade {
   
    @PersistenceContext
    private EntityManager em;
    
    public List<SubjectTag> retireveAllSubjectTags()
    {
        TypedQuery<SubjectTag> query= em.createNamedQuery("SubjectTag.findAll",SubjectTag.class);
        return query.getResultList();
    }

    public SubjectTag findSubjectTag(Long id) {
       return em.find(SubjectTag.class, id);
    }
}
