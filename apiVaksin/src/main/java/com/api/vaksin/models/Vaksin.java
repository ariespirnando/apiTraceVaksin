package com.api.vaksin.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Vaksin {
     
    private String jenisVaksin;

    @JsonIgnore
    private String nmVaksin; 
    private List<String> nmVaksins;   

     

    public Vaksin() {
    }

    public Vaksin(String jenisVaksin, String nmVaksin, List<String> nmVaksins) {
        this.jenisVaksin = jenisVaksin;
        this.nmVaksin = nmVaksin;
        this.nmVaksins = nmVaksins;
    }

    public String getJenisVaksin() {
        return this.jenisVaksin;
    }

    public void setJenisVaksin(String jenisVaksin) {
        this.jenisVaksin = jenisVaksin;
    }

    public String getNmVaksin() {
        return this.nmVaksin;
    }

    public void setNmVaksin(String nmVaksin) {
        this.nmVaksin = nmVaksin;
    }

    public List<String> getNmVaksins() {
        return this.nmVaksins;
    }

    public void setNmVaksins(List<String> nmVaksins) {
        this.nmVaksins = nmVaksins;
    }
 

    @Override
    public String toString() {
        return "{" +
            " jenisVaksin='" + getJenisVaksin() + "'" +
            ", nmVaksin='" + getNmVaksin() + "'" +
            ", nmVaksins='" + getNmVaksins() + "'" +
            "}";
    }
     

}
