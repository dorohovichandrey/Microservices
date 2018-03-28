package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static io.netty.util.concurrent.FastThreadLocal.size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "team")
public class Team {

    @Id
    private String id;
    private String name;
    private List<String> regularPlayerIds;
    private List<String> substitutePlayerIds;

    public List<String> getPlayerIds(){
        List<String> playerIds = new ArrayList<>(regularPlayerIds.size() + substitutePlayerIds.size());
        playerIds.addAll(regularPlayerIds);
        playerIds.addAll(substitutePlayerIds);
        return playerIds;
    }

}
