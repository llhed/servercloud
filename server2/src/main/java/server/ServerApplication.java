package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lim on 18/1/2.
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServerApplication {

    @RequestMapping("/service2")
    public String server(){
        return "server2";
    }

    public static void main(String[] args){

        SpringApplication.run(ServerApplication.class, args);
    }
}
