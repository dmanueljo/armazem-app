/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import mz.nilzaproject.cedsif.model.db.ArmazemItem;
import mz.nilzaproject.cedsif.model.db.Material;
import mz.nilzaproject.cedsif.service.rules.Rule;
import mz.nilzaproject.cedsif.service.rules.Rules;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 *
 * @author nilza.graca
 */
@ContextConfiguration(locations = "classpath:datasource-test-configuration.xml")
public abstract class CustomSpringJUnitTransactionalOperations extends AbstractTransactionalJUnit4SpringContextTests{
   
    /**
     * Will bring the hibernate injection from spring-context
     */
    @Autowired
    protected HibernateTemplate hiberTemplate;

    @Before
    public abstract void setUp();
    
    public Rule getRule() {
        
      return new Rules();
      
    }
    
    //<property name="hbm2ddl.auto">create</property>
    @Override
    protected void executeSqlScript(String sqlResourcePath, boolean continueOnError) throws DataAccessException {
        super.executeSqlScript("classpath:armazem-table.sql", false); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected List loadFakeData(){
    
        //TDD - //itemDAO.list();
        List<ArmazemItem> itens = new ArrayList();
        
        //adicionando valores do material do item
        Material m1 = new Material(1);
        m1.setAnoFabrico(2021);
        m1.setTipo("DESKTOP");
        
         //Criar um objecto Item
        ArmazemItem item1 = new ArmazemItem(1);
        item1.setCodigo(1111);
        item1.setMaterialId(m1);
        item1.setDataEntrada(Calendar.getInstance().getTime());
        
        //adicionando valores do material do item
        Material m2 = new Material(2);
        m2.setAnoFabrico(2021);
        m2.setTipo("IMPRESSORA");
        
        //item2
        ArmazemItem item2 = new ArmazemItem(2);
        item2.setMaterialId(m2);
        item2.setDataEntrada(Calendar.getInstance().getTime());
        
        //adicionar os items a lista de item que e um armazem
        itens.add(item1);
        itens.add(item2);
        
        return itens;
    }

}
