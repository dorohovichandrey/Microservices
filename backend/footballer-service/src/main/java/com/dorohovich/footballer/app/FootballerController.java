package com.dorohovich.footballer.app;

import com.dorohovich.footballer.common.FootballerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.dorohovich.footballer.app.FootballerDTOConverter.toDTOList;

@Controller
@RequestMapping("/footballer")
public class FootballerController {

    @Autowired
    private FootballerRepository footballerRepository;

    @GetMapping
    public ResponseEntity<List<FootballerDTO>> getList(){
        /*return ResponseEntity.ok(Arrays.asList(
                toDTO(new Footballer("1","Wayne", "Rooney", 32, 81)),
                toDTO(new Footballer("2","Alex", "Hleb", 38, 72)),
                toDTO(new Footballer("3","Santi", "Cazorla", 33, 80))
            )
        );*/
        List<FootballerDTO> footballerDTOList = toDTOList(footballerRepository.findAll());
        return ResponseEntity.ok(footballerDTOList);
    }

    @PostMapping("/by-ids")
    public ResponseEntity<List<FootballerDTO>> getFootballerListById(@RequestBody List<String> idList){
        List<FootballerDTO> footballerDTOList = toDTOList(
                footballerRepository.findFootballersByIdIn(idList));
        return ResponseEntity.ok(footballerDTOList);
    }
}
