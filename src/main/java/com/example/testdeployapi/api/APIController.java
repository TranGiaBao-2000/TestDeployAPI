package com.example.testdeployapi.api;

import com.example.testdeployapi.entity.Connect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> testConnect(){
        Connect cn = new Connect("Connected");
        return ResponseEntity.ok(cn);
    }

}
