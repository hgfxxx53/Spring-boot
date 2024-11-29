package com.example.demo.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private String name;
    private String description;

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
    public String getDescription( ) {
        return description;
    }
    public void setDescription( String description ) {
        this.description = description;
    }

    @ConfigurationProperties(prefix = "app")
    public AppConfig appConfig( ) {
        return new AppConfig();
    }
}


