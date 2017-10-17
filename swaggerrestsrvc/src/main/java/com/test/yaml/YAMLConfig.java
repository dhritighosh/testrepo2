package com.test.yaml;


import com.test.swagger.Server;
import com.test.swagger.Spring;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private Spring spring;
    private String name;
    private String environment;
    private Server server;

    public void setServer(Server server) {
        this.server = server;
    }

    public Spring getSpring() {
        return spring;
    }

    public Server getServer() {
        return server;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getName() {
        return name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpring(Spring spring) {
        this.spring = spring;
    }

}
