package com.htth.web.repository;

import com.htth.web.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    public boolean existsByUser(String user);
}
