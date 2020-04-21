package com.ipiecoles.java.mdd324.homepage;

import com.ipiecoles.java.mdd324.homepage.api.KeyApiResponse;
import com.ipiecoles.java.mdd324.homepage.controller.CovidInfoController;
import com.ipiecoles.java.mdd324.homepage.model.CovidInfo;
import com.ipiecoles.java.mdd324.homepage.model.Key;
import com.ipiecoles.java.mdd324.homepage.service.CovidService;
import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    CovidInfoController covidInfoController;

    @Autowired
    CovidService covidService;

    @Override
    public void run(String... args) throws Exception {
        //List<KeyApiResponse> test =  Utils.getPageContents(" https://open-covid-19.github.io/data/data_latest.json");
        //System.out.println(test);
    }
}
