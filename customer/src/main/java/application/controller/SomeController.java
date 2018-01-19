package application.controller;

import application.interfaces.CustomSome;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lim on 18/1/4.
 */

@RestController
public class SomeController {

    @Autowired
    CustomSome customSome;

    @RequestMapping(value = "/some",method = RequestMethod.GET)
    public String customSomeMethod(){
        return customSome.customSome();
    }
}
