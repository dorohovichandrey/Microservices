package com.dorohovich.footballer.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "footballer")
public class Footballer {

    @Id
    private String id;
    private String name;
    private Integer rating;
    private String position;
    private String foot;

}
