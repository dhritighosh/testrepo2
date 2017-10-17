package com.test;

import com.test.yaml.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private YAMLConfig myConfig;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... args) throws Exception{
        System.out.println("Using environment: " + myConfig.getEnvironment() + " | " + myConfig.getSpring().getProfiles().getActive());
        System.out.println("Name: " + myConfig.getName());
        System.out.println("Port: " + myConfig.getServer().getPort());
    }

}
