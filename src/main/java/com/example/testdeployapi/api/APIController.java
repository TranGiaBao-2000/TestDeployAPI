package com.example.testdeployapi.api;

import com.example.testdeployapi.entity.Connect;
import com.example.testdeployapi.entity.UserEntity;
import com.example.testdeployapi.repository.ConnectRepository;
import com.example.testdeployapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class APIController {
    @Autowired
    ConnectRepository connectRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> testConnect() {

        List<Connect> cn = connectRepository.findAll();
        return ResponseEntity.ok(cn);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getListUser() {
        List<UserEntity> list = userRepository.findAll();
        return ResponseEntity.ok(list);
    }

}
