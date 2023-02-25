package com.api.karyawan.services;

import java.util.List;

import com.api.karyawan.models.Karyawan;

public interface IKaryawanService { 
    public List<Karyawan> findAllKaryawan();
    public Karyawan findKaryawanById(int id);
}
