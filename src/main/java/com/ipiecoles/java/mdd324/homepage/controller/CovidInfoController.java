package com.ipiecoles.java.mdd324.homepage.controller;
import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/covid")
public class CovidInfoController {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value = "{key}")
    public void sendKey(
            @PathVariable("key") String key
    ){
        Utils utils = new Utils();
        try {
            utils.getPageContents("https://open-covid-19.github.io/data/data_latest.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
