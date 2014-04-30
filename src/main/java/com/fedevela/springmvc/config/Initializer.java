package com.fedevela.springmvc.config;

/**
 * Created by Federico on 30/04/14.
 */
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.fedevela.springmvc.config.DatabaseConfig;

@Order(1)
public class Initializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Initializer -> getRootConfigClasses:  Inicio");
        return new Class[] {DatabaseConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Initializer -> getServletConfigClasses:  Inicio");
        return new Class<?>[] { WebAppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Initializer -> getServletMappings:  Inicio");
        return new String[] { "/" };
    }

}
