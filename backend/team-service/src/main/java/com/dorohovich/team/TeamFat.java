package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamFat {

    private String id;
    private String name;
    private List<FootballerDTO> regularPlayers;
    private List<FootballerDTO> substitutePlayers;

    public static TeamFat valueOf(Team team, List<FootballerDTO> players){
        List<FootballerDTO> regularPlayers = new ArrayList<>(11);
        List<FootballerDTO> substitutePlayers = new ArrayList<>();
        for (FootballerDTO player : players) {
            if(team.getRegularPlayerIds().contains(player.getId())){
                regularPlayers.add(player);
            } else {
                substitutePlayers.add(player);
            }
        }
        return TeamFat.builder()
                .id(team.getId())
                .name(team.getName())
                .regularPlayers(regularPlayers)
                .substitutePlayers(substitutePlayers)
                .build();
    }

}
