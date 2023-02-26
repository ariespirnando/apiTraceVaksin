package com.api.vaksin.models;

public class Vaksin {
     
    private String jenisVaksin;
    private String nmVaksin;  

    public Vaksin() {
    }

    public Vaksin(String jenisVaksin, String nmVaksin) {
        this.jenisVaksin = jenisVaksin;
        this.nmVaksin = nmVaksin;
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

    @Override
    public String toString() {
        return "{" +
            " jenisVaksin='" + getJenisVaksin() + "'" +
            ", nmVaksin='" + getNmVaksin() + "'" +
            "}";
    }
     

}
