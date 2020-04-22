package com.ipiecoles.java.mdd324.homepage.controller;
import com.ipiecoles.java.mdd324.homepage.model.CovidInfo;
import com.ipiecoles.java.mdd324.homepage.model.Key;
import com.ipiecoles.java.mdd324.homepage.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/covid")
public class CovidInfoController {

    @Autowired
    private CovidService covidService;

    //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping
    public CovidInfo getCovid(@RequestBody Key key) throws Exception {
        return covidService.getCovidValues(key);
        }
}

