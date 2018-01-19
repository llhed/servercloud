package application.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lim on 18/1/4.
 */

@FeignClient(value = "service2")
public interface CustomService2 {

    @RequestMapping(value = "/service2",method = RequestMethod.GET)
    String customService2();

}
