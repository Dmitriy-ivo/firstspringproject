package com.example.firstspringproject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUsers(){
        try {
            return ResponseEntity.ok("Подключение удалось");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка Users контроллера");
        }
    }
}
