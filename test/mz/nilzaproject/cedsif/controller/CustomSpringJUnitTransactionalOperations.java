/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.controller;

import mz.nilzaproject.cedsif.service.rules.Rule;
import mz.nilzaproject.cedsif.service.rules.Rules;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author nilza.graca
 */
@ContextConfiguration(locations = "classpath:datasource-test-configuration.xml")
public abstract class CustomSpringJUnitTransactionalOperations extends AbstractTransactionalJUnit4SpringContextTests{
    
   private Rule rule;
    /**
     * Will bring the hibernate injection from spring-context
     */
    @Autowired
    protected HibernateTemplate hiberTemplate;

    public Rule getRule() {
        return new Rules();
    }
    
    @Before
    public abstract void setUp();
    
    
    
     

}
