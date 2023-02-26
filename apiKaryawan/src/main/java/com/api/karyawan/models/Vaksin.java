package com.api.karyawan.models;

import java.util.List;
 

public class Vaksin {
     
    private String jenisVaksin;
 
    private List<String> nmVaksins;   
  

    public Vaksin() {
    }

    public Vaksin(String jenisVaksin, List<String> nmVaksins) {
        this.jenisVaksin = jenisVaksin;
        this.nmVaksins = nmVaksins;
    }

    public String getJenisVaksin() {
        return this.jenisVaksin;
    }

    public void setJenisVaksin(String jenisVaksin) {
        this.jenisVaksin = jenisVaksin;
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
            ", nmVaksins='" + getNmVaksins() + "'" +
            "}";
    }

}
