package com.dockerApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {

    @GetMapping
    public String getMessage(){
        return "Welcome";
    }
}
