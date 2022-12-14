
package com.example.capstone_tests.domain.dto.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto{

    private Long id;
    private String roleName;
    private String roleDesc;
    private LocalDateTime regDate, modDate;
}


