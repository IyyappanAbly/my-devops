package com.devops.devopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/devops")
    public String getData(){
        return "This is devops automation from palan";
    }

}
