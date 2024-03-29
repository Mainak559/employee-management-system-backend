package com.mainak.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCORSConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/**")
                //.allowedOrigins("https://employeemanagementsystem-mainakhalder.azurewebsites.net")
                .allowedOrigins("https://localhost:3000") // Adjust the origin
                                                                                                   // as needed
                .allowedMethods("GET","POST","PUT","DELETE") // Allow all HTTP methods
                .allowedHeaders("*"); // Allow all headers
    }
}
