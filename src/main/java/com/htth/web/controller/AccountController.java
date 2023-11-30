package com.htth.web.controller;

import com.htth.web.entity.CreateAccountRequest;
import com.htth.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class AccountController {
    @Autowired
    AccountService service;
    @GetMapping("accounts")
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(service.getAllAccounts());
    }
    @PostMapping("accounts")
    public ResponseEntity<?> createAccount(@RequestBody CreateAccountRequest request){
        return ResponseEntity.ok(service.createAccount(request));
    }
    @GetMapping("accounts/bypass")
    public ResponseEntity<?> createAccount(@RequestParam(name = "username") String username,@RequestParam(name="password") String pass){
        CreateAccountRequest request = new CreateAccountRequest();
        request.setUser(username);
        request.setPass(pass);
        request.setPhone("0");
        return ResponseEntity.ok(service.createAccount(request));
    }
}
