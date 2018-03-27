package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Component
public class TeamRenderer {

    private static final List<FootballerDTO> FOOTBALLERS = Arrays.asList(
            new FootballerDTO("1","Wayne", "Rooney", 32, 81),
            new FootballerDTO("2","Alex", "Hleb", 38, 72),
            new FootballerDTO("3","Santi", "Cazorla", 33, 80)
    );

    public String render(FootballerDTO footballers){
          String a = "__()__ ";
          String b = " |12|  ";
          String c = " l  l @";
          return null;
    }

    public static void main(String[] args) {
       /* List<FootballerDTO> footballers = FOOTBALLERS;
        String a = "__o__ ";
        for (int i = 0; i < FOOTBALLERS; i++) {

        }*/
        String line = drawFootballer(FOOTBALLERS.get(0), 3);
        System.out.println(line);
    }

    static String drawFootballer(FootballerDTO footballer, Integer x){
        String[] icon = new String[3];
        icon[0] =          "__o__";
        icon[1] =          " 15| ";
        icon[2] =          " l l ";
        String freeSpace = "     ";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < icon.length; i++) {
            for (int j = 0; j < 7; j++) {
                if(j == x){
                    stringBuilder.append(icon[i]);
                } else {
                    stringBuilder.append(freeSpace);
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }


}
