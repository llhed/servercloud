package application.controller;

import application.interfaces.CustomService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lim on 18/1/4.
 */

@RestController
public class Service2Controller {

    @Autowired
    CustomService2 customService2;

    @RequestMapping(value = "/Service2",method = RequestMethod.GET)
    public String cusService(){

        return  customService2.customService2();
    }
}
