package com.example.capstone_tests.service.impl;

import com.example.capstone_tests.domain.dto.request.ReqAddMapConditionDto;
import com.example.capstone_tests.domain.dto.response.ResAddMapConditionDto;
import com.example.capstone_tests.repository.PostRepository;
import com.example.capstone_tests.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    @Transactional
    public List<ResAddMapConditionDto> getMarkerByCondition(ReqAddMapConditionDto req) {
        List<ResAddMapConditionDto> markers = postRepository.getMarkerByCondition(req.getSwLat(), req.getNeLat(), req.getSwLng(), req.getNeLng());
        return markers;
    }
}
