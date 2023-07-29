package me.harshu.getstartedspringmvc.config;

import me.harshu.getstartedspringmvc.WebAppinitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = WebAppinitializer.class)
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("Hello Spring MVC");
    }
}
