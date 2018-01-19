package ServerSome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lim on 18/1/2.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SomeApp {

    @RequestMapping("/some")
    public String someService(){
        return "someService";
    }

    public static void main(String[] args){
        SpringApplication.run(SomeApp.class, args);
    }
}
