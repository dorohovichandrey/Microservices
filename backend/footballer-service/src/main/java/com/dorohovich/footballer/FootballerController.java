package com.dorohovich.footballer;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import static com.dorohovich.footballer.FootballerDTOConverter.fromDTO;
import static com.dorohovich.footballer.FootballerDTOConverter.toDTO;

@Controller
@RequestMapping("/footballer")
public class FootballerController {

    @GetMapping
    public ResponseEntity<List<FootballerDTO>> getList(){
        return ResponseEntity.ok(Arrays.asList(
                toDTO(new Footballer("1","Wayne", "Rooney", 32, 81)),
                toDTO(new Footballer("2","Alex", "Hleb", 38, 72)),
                toDTO(new Footballer("3","Santi", "Cazorla", 33, 80))
            )
        );
    }
}
