package com.example.capstone_tests.repository;

import com.example.capstone_tests.domain.dto.response.ResAddMapConditionDto;
import com.example.capstone_tests.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    //특정 컬럼만 조회시 JpaRepository 의 클래스를 상속받아야 사용 가능
    @Query(value = "SELECT new com.example.capstone_tests.domain.dto.response.ResAddMapConditionDto(postName, lat, lng) FROM Post WHERE lat BETWEEN :swLat AND :neLat AND lng BETWEEN :swLng AND :neLng")
    List<ResAddMapConditionDto> getMarkerByCondition(String swLat, String neLat, String swLng, String neLng);

}
