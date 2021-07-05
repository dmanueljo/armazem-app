/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.nilzaproject.cedsif.utils;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author nilza.graca
 */
@WebAppConfiguration(value = "classpath:spring-context-test")
@ContextConfiguration(locations = "classpath:spring-context-test")    //{"classpath:spring-context-test.xml",
                            //       "classpath:dispatcher-servlet-test.xml"})
public abstract class CustomBeanTestSpringJUnitMVC {
    
    public abstract void setUp();       
       
}