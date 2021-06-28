/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.service.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mz.nilzaproject.cedsif.controller.CustomSpringJUnitTransactionalOperations;
import mz.nilzaproject.cedsif.dao.ArmazemItemDAO;
import mz.nilzaproject.cedsif.dao.ArmazemItemDAOImpl;
import mz.nilzaproject.cedsif.dao.MaterialDAO;
import mz.nilzaproject.cedsif.dao.MaterialDAOImpl;
import mz.nilzaproject.cedsif.model.db.ArmazemItem;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
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
        
        ArmazemItem a = Mockito.mock(ArmazemItem.class);
        //veryfy
        
        Mockito.when(a.getStatus()).thenReturn("LEILOADO");
        Mockito.verify(a).setStatus("obsoleto");
        
        
       /**
         * 
         * when itens equals empty
         * than fetch itemDAO.list() to itens
         * 
         */
        //Mockito.when(items).thenReturn(itemDAO.list()); 
        //MatcherAssert.assertThat(items, CoreMatchers.is(CoreMatchers.equalTo(Collections.EMPTY_LIST)));
        //check assertation
       // assertThat(itens, is(rule));
        
        
    }
    
    @Override
    public void testRegra1DeterminaIdadeDeUmEquipamentoOuMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void testRegra2DefineQuandoUmDeterminiadoEquipamentoPodeSerLeiloado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
