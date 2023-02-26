package com.api.karyawan.models;

import java.util.List;
 
public class Karyawan {
    
    private int idKaryawan;
    private String namaKaryawan;
    private String divisiKaryawan;
    private String posisiKaryawan;
    private String alamatKaryawan;
    private List<Vaksin> vaksin;
   
    public Karyawan() {
    }

    public Karyawan(int idKaryawan, String namaKaryawan, String divisiKaryawan, String posisiKaryawan, String alamatKaryawan, List<Vaksin> vaksin) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.divisiKaryawan = divisiKaryawan;
        this.posisiKaryawan = posisiKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.vaksin = vaksin;
    }

    public int getIdKaryawan() {
        return this.idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return this.namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getDivisiKaryawan() {
        return this.divisiKaryawan;
    }

    public void setDivisiKaryawan(String divisiKaryawan) {
        this.divisiKaryawan = divisiKaryawan;
    }

    public String getPosisiKaryawan() {
        return this.posisiKaryawan;
    }

    public void setPosisiKaryawan(String posisiKaryawan) {
        this.posisiKaryawan = posisiKaryawan;
    }

    public String getAlamatKaryawan() {
        return this.alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public List<Vaksin> getVaksin() {
        return this.vaksin;
    }

    public void setVaksin(List<Vaksin> vaksin) {
        this.vaksin = vaksin;
    }
 
    @Override
    public String toString() {
        return "{" +
            " idKaryawan='" + getIdKaryawan() + "'" +
            ", namaKaryawan='" + getNamaKaryawan() + "'" +
            ", divisiKaryawan='" + getDivisiKaryawan() + "'" +
            ", posisiKaryawan='" + getPosisiKaryawan() + "'" +
            ", alamatKaryawan='" + getAlamatKaryawan() + "'" +
            ", vaksin='" + getVaksin() + "'" +
            "}";
    }
     

}
