package com.ipiecoles.java.mdd324.homepage.model;

import java.util.Objects;

public class CovidInfo {

    private String Pays;
    private Double nbCas;
    private Double nbDeces;

    //Generate constructor with attributs
    public CovidInfo(String pays, Double nbCas, Double nbDeces) {
        Pays = pays;
        this.nbCas = nbCas;
        this.nbDeces = nbDeces;
    }

    //Generate constructor void
    public CovidInfo() {
    }

    //Generate Getter and setter for attributs
    public String getPays() {
        return Pays;
    }

    public void setPays(String pays) {
        Pays = pays;
    }

    public Double getNbCas() {
        return nbCas;
    }

    public void setNbCas(Double nbCas) {
        this.nbCas = nbCas;
    }

    public Double getNbDeces() {
        return nbDeces;
    }

    public void setNbDeces(Double nbDeces) {
        this.nbDeces = nbDeces;
    }

    //Generate Hash code and equals functions
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CovidInfo covidInfo = (CovidInfo) o;
        return Objects.equals(Pays, covidInfo.Pays) &&
                Objects.equals(nbCas, covidInfo.nbCas) &&
                Objects.equals(nbDeces, covidInfo.nbDeces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Pays, nbCas, nbDeces);
    }
}
