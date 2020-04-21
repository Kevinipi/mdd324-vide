package com.ipiecoles.java.mdd324.homepage.service;

import com.ipiecoles.java.mdd324.homepage.api.KeyApiResponse;
import com.ipiecoles.java.mdd324.homepage.model.CovidInfo;
import com.ipiecoles.java.mdd324.homepage.model.Key;
import com.ipiecoles.java.mdd324.homepage.utils.Utils;
import com.owlike.genson.GenericType;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidService {

    public CovidInfo getCovidValues(final Key input) throws Exception {
        Genson genson = new GensonBuilder().useRuntimeType(true).create();
        System.out.println("TESTHAHA");
        try {
            final String pageContents = Utils.getPageContents(" https://open-covid-19.github.io/data/data_latest.json");
            List<KeyApiResponse> covidDataList = genson.deserialize(pageContents, new GenericType<>(){});

            //Bouclé sur la liste si la Key est égale a celle saisie alors affiché les données sinon erreur
            CovidInfo covidInfoReturn = new CovidInfo();
            for (int i = 0; i < covidDataList.size(); i++){
                if(covidDataList.get(i).getKey() == input.getKey()){
                    covidInfoReturn.setNbCas(covidDataList.get(i).getConfirmed());
                    covidInfoReturn.setNbDeces(covidDataList.get(i).getDeaths());
                    covidInfoReturn.setPays(covidDataList.get(i).getCountryName());
                }else {
                    throw new Exception("La clé" + input.getKey() + "n'existe pas");
                }
            }
            return covidInfoReturn;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
