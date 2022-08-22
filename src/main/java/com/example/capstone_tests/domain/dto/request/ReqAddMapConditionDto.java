package com.example.capstone_tests.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqAddMapConditionDto {

    private String swLat;
    private String neLat;
    private String swLng;
    private String neLng;
}
