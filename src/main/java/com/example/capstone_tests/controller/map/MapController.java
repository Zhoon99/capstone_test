package com.example.capstone_tests.controller.map;

import com.example.capstone_tests.domain.dto.request.ReqAddMapConditionDto;
import com.example.capstone_tests.domain.dto.response.ResAddMapConditionDto;
import com.example.capstone_tests.service.PostService;
import com.nimbusds.jose.shaded.json.JSONObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class MapController {

    private final PostService postService;

    @ResponseBody
    @RequestMapping(value = "/addMapCondition", method = RequestMethod.POST)
    public List<ResAddMapConditionDto> addMapCondition(@RequestBody ReqAddMapConditionDto condition) {
        List<ResAddMapConditionDto> markers = postService.getMarkerByCondition(condition);
        return markers;
    }
}
