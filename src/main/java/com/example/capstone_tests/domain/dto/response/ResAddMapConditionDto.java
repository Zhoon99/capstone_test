package com.example.capstone_tests.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class ResAddMapConditionDto {

    private String postName;
    private String lat;
    private String lng;

    public ResAddMapConditionDto(String postName, String lat, String lng) {
        this.postName = postName;
        this.lat = lat;
        this.lng = lng;
    }
}
