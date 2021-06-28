/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.service.rules;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import mz.nilzaproject.cedsif.controller.CustomSpringJUnitTransactionalOperations;
import mz.nilzaproject.cedsif.dao.ArmazemItemDAO;
import mz.nilzaproject.cedsif.dao.ArmazemItemDAOImpl;
import mz.nilzaproject.cedsif.dao.MaterialDAO;
import mz.nilzaproject.cedsif.dao.MaterialDAOImpl;
import mz.nilzaproject.cedsif.model.db.ArmazemItem;
import mz.nilzaproject.cedsif.model.db.Material;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
/**
 *
 * @author nilza.graca
 */

public class RulesIntegrationTest extends CustomSpringJUnitTransactionalOperations implements RuleTest {
   
    private static Log LOG = LogFactory.getLog(RulesIntegrationTest.class);
    
    
    private ArmazemItemDAO itemDAO;
    private MaterialDAO matDAO;
    
    
    private List<ArmazemItem> items;
    
    @Override
    public void setUp() {
        itemDAO = new ArmazemItemDAOImpl(hiberTemplate);
        matDAO  = new MaterialDAOImpl(hiberTemplate);
        
        //enabling mockito
       MockitoAnnotations.initMocks(this);
       
    }
    
    @Test
    @Override
    public void testRegra3DefineQuantidadeMaterialObsoletoArmazenadoOuLeiloado() {
        
        /*
        ArmazemItem item1 = Mockito.mock(ArmazemItem.class);
        ArmazemItem item2 = Mockito.mock(ArmazemItem.class);
        */
        
        List<ArmazemItem> item = this.loadFakeData();
        
        //save it to testdb
        itemDAO.createOrUpdate(item.get(0));
        //itemDAO.createOrUpdate(item2);
        
        //test equals
        Assert.assertEquals(item,item.get(0));
        
        //assertThat(item1, CoreMatchers.equalTo(itens.get(0)));
        /**
         * 
        Mockito.when(a.getStatus()).thenReturn("LEILOADO");
        Mockito.verify(a).setStatus("obsoleto");
         */
        
       /**
         * 
         * when itens equals empty
         * than fetch itemDAO.list() to itens
         * 
         */
        //Mockito.when(items).thenReturn(itemDAO.list()); 
        //MatcherAssert.assertThat(items, CoreMatchers.is(CoreMatchers.equalTo(Collections.EMPTY_LIST)));
        
            //check assertation
         
    }
    
    
    
    
    @Override
    public void testRegra1DeterminaIdadeDeUmEquipamentoOuMaterial() {
        
    }

    @Override
    public void testRegra2DefineQuandoUmDeterminiadoEquipamentoPodeSerLeiloado() {
       
    }

    @Override
    public void testRegra2DefineSeUmDeterminiadoEquipamentoPodeSerLeiloadoQuandoAIdadeDoEquipamentoFor1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineSeUmDeterminiadoEquipamentoPodeSerLeiloadoQuandoAIdadeDoEquipamentoFor2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineSeUmDeterminiadoEquipamentoPodeSerLeiloadoQuandoIdadeItemNoArmazemForMaiorQue9EIdadeDoEquipamentoMaiorQue1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineQuantidadeMaterialObsoletoLeiloadoTipoDesktop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineQuantidadeMaterialObsoletoLeiloadoTipoLaptop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineQuantidadeMaterialObsoletoLeiloadoTipoImpressora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra3DefineQuantidadeMaterialObsoletoPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra3DefineQuantidadeMaterialObsoletoQuandoTipoForDesktop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra3DefineQuantidadeMaterialObsoletoQuandoTipoForLaptop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra3DefineQuantidadeMaterialObsoletoQuandoTipoForImpressora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
