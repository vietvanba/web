package com.htth.web.service;

import com.htth.web.entity.Account;
import com.htth.web.entity.CreateAccountRequest;
import com.htth.web.exception.CantSaveException;
import com.htth.web.mapper.AccountMapper;
import com.htth.web.repository.AccountRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    AccountRepository repository;

    public List<AccountMapper> getAllAccounts() {
        List<Account> list = repository.findAll();
        return list.stream().map(x -> mapper.map(x, AccountMapper.class)).toList();
    }

    public AccountMapper createAccount(CreateAccountRequest request) {
        if (repository.existsByUser(request.getUser())) {
            throw new CantSaveException("Username đã được sử dụng. Vui lòng chọn username khác!");
        } else {
            try {
                Account account = new Account(
                        request.getUser(),
                        request.getPass(),
                        "[]",
                        (short) 0,
                        request.getPhone(),
                        0,
                        1,
                        0,
                        0L,
                        0L
                );
                return mapper.map(repository.save(account), AccountMapper.class);
            } catch (Exception e) {
                throw new CantSaveException("Không thể tạo tài khoản vui lòng thử lại");
            }
        }
    }
}
