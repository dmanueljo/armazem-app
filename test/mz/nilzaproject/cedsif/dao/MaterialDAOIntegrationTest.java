/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.dao;

import mz.nilzaproject.cedsif.controller.CustomSpringJUnitTransactionalOperations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author nilza.graca
 */
public class MaterialDAOIntegrationTest extends CustomSpringJUnitTransactionalOperations{
    
    private static Log LOG = LogFactory.getLog(MaterialDAOIntegrationTest.class);

    private MaterialDAO materialDAO;
    
    @Test
    public void setUp(){
        materialDAO = new MaterialDAOImpl(hiberTemplate);
    }
    
}
