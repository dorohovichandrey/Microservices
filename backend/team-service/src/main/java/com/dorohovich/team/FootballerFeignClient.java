package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "FOOTBALLER-SERVICE")
public interface FootballerFeignClient {

    @RequestMapping(value = "/footballer/by-ids", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<FootballerDTO>> getFootballersById(@RequestBody List<String> idList);

}
