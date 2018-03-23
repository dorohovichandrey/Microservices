package com.dorohovich.footballer;

public class FootballerDTOConverter {

    public static FootballerDTO toDTO(Footballer footballer){
        return FootballerDTO.builder()
                .id(footballer.getId())
                .name(footballer.getName())
                .surname(footballer.getSurname())
                .age(footballer.getAge())
                .skill(footballer.getSkill())
                .build();
    }

    public static Footballer fromDTO(FootballerDTO footballerDTO){
        return Footballer.builder()
                .id(footballerDTO.getId())
                .name(footballerDTO.getName())
                .surname(footballerDTO.getSurname())
                .age(footballerDTO.getAge())
                .skill(footballerDTO.getSkill())
                .build();
    }
}