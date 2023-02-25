package com.api.vaksin.services;

import java.util.List;

import com.api.vaksin.models.Vaksin;

public interface IVaksinService { 
    public List<Vaksin> findAllKaryawan();
    public Vaksin findKaryawanById(int id);
}
