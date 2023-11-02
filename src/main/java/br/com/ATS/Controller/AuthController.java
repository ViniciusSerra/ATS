package br.com.ATS.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/Auth")
    public String sayHello() {
        return "Hello, World!";
    }
}