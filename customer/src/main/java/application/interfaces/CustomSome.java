package application.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lim on 18/1/4.
 */
@FeignClient(value = "some")
public interface CustomSome {

    @RequestMapping(value = "/some" , method = RequestMethod.GET)
    String customSome();
}
