package com.rdemir.coursera.courseraspringframework;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
