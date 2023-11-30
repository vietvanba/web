package com.htth.web.service;

import com.htth.web.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.htth.web.entity.Account;
import java.util.List;

@Service
public class Account {
    @Autowired
    AccountRepository repository;
    public List<> getAllAccounts()
    {
        return repository.findAll();
    }
}
