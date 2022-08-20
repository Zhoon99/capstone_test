package com.example.capstone_tests.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String email;
    private String username;
    private String password;
    private List<String> roles;

    private String provider;
    private String providerId;

    private LocalDateTime regDate, modDate;
}


