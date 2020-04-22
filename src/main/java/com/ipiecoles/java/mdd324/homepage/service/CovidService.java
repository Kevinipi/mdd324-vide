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
        CovidInfo covidInfoReturn = null;
        try {
            final String pageContents = Utils.getPageContents(" https://open-covid-19.github.io/data/data_latest.json");
            List<KeyApiResponse> covidDataList = genson.deserialize(pageContents, new GenericType<List<KeyApiResponse>>(){});

            //Bouclé sur la liste si la Key est égale a celle saisie alors affiché les données sinon erreur
            for (int i = 0; i < covidDataList.size(); i++){
                if(covidDataList.get(i).getKey().equals(input.getKey())) {
                    covidInfoReturn = new CovidInfo();
                    covidInfoReturn.setNbCas(covidDataList.get(i).getConfirmed());
                    covidInfoReturn.setNbDeces(covidDataList.get(i).getDeaths());
                    covidInfoReturn.setPays(covidDataList.get(i).getCountryName());
                }
            }
            if (covidInfoReturn != null) {
                return covidInfoReturn;
            }else{
                throw new Exception("La clé" + input.getKey() + "n'existe pas");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
