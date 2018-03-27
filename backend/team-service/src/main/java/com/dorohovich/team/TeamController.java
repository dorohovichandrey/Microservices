package com.dorohovich.team;

import com.dorohovich.footballer.common.FootballerDTO;
import io.reactivex.netty.protocol.http.server.HttpServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private FootballerFeignClient footballerFeignClient;

    @GetMapping
    @ResponseBody
    public String getTeam(){
        String hleb = "                     HLEB          HENRY\n" +
                      "                      13             14   ";
        hleb = hleb.replace(" ", "&nbsp");
        hleb = hleb.replace("\n", "<br>");
        String template = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "h2 {font-family:monospace;color:red;}\n" +
                "p {color:blue;}\n" +
                "</style>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  <title>JS Bin</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>" +
                hleb +
                "</h2>" +
                "\n" +
                "</body>\n" +
                "</html>";

        return template;
    }
}
