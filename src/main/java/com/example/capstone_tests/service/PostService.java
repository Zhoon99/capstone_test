package com.example.capstone_tests.service;

import com.example.capstone_tests.domain.dto.request.ReqAddMapConditionDto;
import com.example.capstone_tests.domain.dto.response.ResAddMapConditionDto;

import java.util.List;

public interface PostService {

    List<ResAddMapConditionDto> getMarkerByCondition(ReqAddMapConditionDto reqAddMapConditionDto);
}
