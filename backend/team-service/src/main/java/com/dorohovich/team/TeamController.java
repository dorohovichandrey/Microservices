package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private FootballerFeignClient footballerFeignClient;

    @GetMapping
    public ResponseEntity<String> getTeam(){
        return ResponseEntity.ok(footballerFeignClient.getList() + "Cool team!!!");
    }
}
