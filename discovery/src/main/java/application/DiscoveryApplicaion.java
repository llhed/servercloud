package application;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Created by lim on 18/1/2.
 */


@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplicaion {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplicaion.class, args);
    }


}
