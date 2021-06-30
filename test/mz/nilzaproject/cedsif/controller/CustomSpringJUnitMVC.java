/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.controller;

import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

/**
 *
 * @author nilza.graca
 */
public abstract class CustomSpringJUnitMVC implements SpringJUnitWebConfig  {

    @Override
    public String[] locations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
