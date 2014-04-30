package com.fedevela.springmvc.config;

/**
 * Created by Federico on 30/04/14.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.fedevela.springmvc")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        System.out.println("WebAppConfig -> setupViewResolver:  Inicio");
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        System.out.println("WebAppConfig -> setupViewResolver:  Fin\n\n");
        return resolver;
    }

    // Maps resources path to webapp/resources
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("WebAppConfig -> addResourceHandlers:  Inicio");
        registry.addResourceHandler("/resources/**").addResourceLocations(
                "/resources/");
        System.out.println("WebAppConfig -> addResourceHandlers:  Fin\n\n");
    }

    // Provides internationalization of messages
    @Bean
    public ResourceBundleMessageSource messageSource() {
        System.out.println("WebAppConfig -> messageSource:  Inicio");
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        System.out.println("WebAppConfig -> messageSource:  Fin\n\n");
        return source;
    }

}
