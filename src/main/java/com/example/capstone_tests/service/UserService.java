package com.example.capstone_tests.service;

import com.example.capstone_tests.domain.dto.AccountDto;
import com.example.capstone_tests.domain.entity.Account;

import java.util.List;


public interface UserService {

    void createUser(AccountDto accountDto);

    void modifyUser(AccountDto accountDto);

    List<Account> getUsers();

    AccountDto getUser(Long id);

    void deleteUser(Long idx);
}
