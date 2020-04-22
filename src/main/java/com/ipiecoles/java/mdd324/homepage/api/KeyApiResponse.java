package com.ipiecoles.java.mdd324.homepage.api;

import com.owlike.genson.annotation.JsonProperty;

import java.util.Objects;

public class KeyApiResponse {

    //Create variables for datas covid
    @JsonProperty("Date") //Define type for JSON File
    private String date;
    @JsonProperty("Key")
    private String Key;
    @JsonProperty("CountryCode")
    private String CountryCode;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("RegionCode")
    private String RegionCode;
    @JsonProperty("RegionName")
    private String RegionName;
    @JsonProperty("Confirmed")
    private Double Confirmed;
    @JsonProperty("Deaths")
    private Double Deaths;
    @JsonProperty("Latitude")
    private Double Latitude;
    @JsonProperty("Longitude")
    private Double Longitude;
    @JsonProperty("Population")
    private Long Population;

    //Generate Constructor void
    public KeyApiResponse() {
    }

    //Generate Constructor with values

    public KeyApiResponse(String date, String key, String countryCode, String countryName, String regionCode, String regionName, Double confirmed, Double deaths, Double latitude, Double longitude, Long population) {
        this.date = date;
        Key = key;
        CountryCode = countryCode;
        CountryName = countryName;
        RegionCode = regionCode;
        RegionName = regionName;
        Confirmed = confirmed;
        Deaths = deaths;
        Latitude = latitude;
        Longitude = longitude;
        Population = population;
    }


    //Generate Getters and Setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        this.Key = key;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getRegionCode() {
        return RegionCode;
    }

    public void setRegionCode(String regionCode) {
        RegionCode = regionCode;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }

    public Double getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(Double confirmed) {
        Confirmed = confirmed;
    }

    public Double getDeaths() {
        return Deaths;
    }

    public void setDeaths(Double deaths) {
        Deaths = deaths;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public Long getPopulation() {
        return Population;
    }

    public void setPopulation(Long population) {
        Population = population;
    }

    //Generate hashcode and equals functions
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyApiResponse that = (KeyApiResponse) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(Key, that.Key) &&
                Objects.equals(CountryCode, that.CountryCode) &&
                Objects.equals(CountryName, that.CountryName) &&
                Objects.equals(RegionCode, that.RegionCode) &&
                Objects.equals(RegionName, that.RegionName) &&
                Objects.equals(Confirmed, that.Confirmed) &&
                Objects.equals(Deaths, that.Deaths) &&
                Objects.equals(Latitude, that.Latitude) &&
                Objects.equals(Longitude, that.Longitude) &&
                Objects.equals(Population, that.Population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, Key, CountryCode, CountryName, RegionCode, RegionName, Confirmed, Deaths, Latitude, Longitude, Population);
    }
}
