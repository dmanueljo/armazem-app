/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.controller;

import mz.nilzaproject.cedsif.utils.CustomBeanTestSpringJUnitMVC;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author nilza.graca
 */

@SpringJUnitWebConfig
@WebAppConfiguration(value = "classpath:spring-context-test.xml")
@ContextConfiguration(locations = "classpath:spring-context-test.xml")
public class LoginControllerTest {//extends CustomBeanTestSpringJUnitMVC {
    
    MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;
    
    public void init() {
        

        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    
    }

    @Test
   // @Override
    public void setUp() {
        
        //assertNotEquals(null, wac);
    }
    
}
