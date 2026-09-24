package com.sec.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class publicController {
    
    public Map<String,Object> repuesta(){
        
        return Map.of("Hola","Hey");

    }

}
