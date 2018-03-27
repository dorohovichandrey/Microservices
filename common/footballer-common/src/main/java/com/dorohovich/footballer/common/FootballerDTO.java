package com.dorohovich.footballer.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FootballerDTO {

    private String id;
    private String name;
    private Integer rating;
    private String position;
    private String foot;

}
