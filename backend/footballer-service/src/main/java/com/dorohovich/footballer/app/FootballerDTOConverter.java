package com.dorohovich.footballer.app;

import com.dorohovich.footballer.common.FootballerDTO;

import java.util.List;
import java.util.stream.Collectors;

public class FootballerDTOConverter {

    public static List<FootballerDTO> toDTOList(List<Footballer> footballers){
        return footballers.stream()
                .map(FootballerDTOConverter::toDTO)
                .collect(Collectors.toList());
    }

    public static FootballerDTO toDTO(Footballer footballer){
        return FootballerDTO.builder()
                .id(footballer.getId())
                .name(footballer.getName())
                .rating(footballer.getRating())
                .position(footballer.getPosition())
                .foot(footballer.getFoot())
                .build();
    }

    public static Footballer fromDTO(FootballerDTO footballerDTO){
        return Footballer.builder()
                .id(footballerDTO.getId())
                .name(footballerDTO.getName())
                .rating(footballerDTO.getRating())
                .position(footballerDTO.getPosition())
                .foot(footballerDTO.getFoot())
                .build();
    }
}
