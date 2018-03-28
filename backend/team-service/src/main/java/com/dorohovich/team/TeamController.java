package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private FootballerFeignClient footballerFeignClient;

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/{name}")
    public ResponseEntity<TeamFat> getTeam(@PathVariable String name){
       /* return footballerFeignClient.getFootballersById(Arrays.asList(
                "5aba4d28bb848640e852d8c3",
                "5aba4d28bb848640e852d8c8",
                "5aba4d28bb848640e852d8da"
        ));*/
       Team team = teamRepository.findOneByName(name);
       List<String> ids = team.getPlayerIds();
       List<FootballerDTO> players = footballerFeignClient.getFootballersById(ids).getBody();
       TeamFat teamFat = TeamFat.valueOf(team, players);
       return ResponseEntity.ok(teamFat);
    }
}
