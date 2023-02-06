package com.example.springaws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("info")
    public ResponseEntity<ServiceInformation> getInfo() {
        return ResponseEntity.ok(infoService.get());
    }
    @GetMapping
    public String demo(){
        return "buenas buenas!";
    }
}
