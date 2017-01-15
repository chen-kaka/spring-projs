package com.kakachan.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by kakachan on 17/1/14.
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
