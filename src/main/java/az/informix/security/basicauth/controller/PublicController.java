package az.informix.security.basicauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping
    public String helloWorldPublic(){
        return "Hello World! From public endpoint";
    }
    @GetMapping("/user")
    public String helloWorldUserPublic(){
        return "Hello World! From user public endpoint";
    }
    @GetMapping("/admin")
    public String helloWorldAdminPublic(){
        return "Hello World! From admin public endpoint";
    }
}
