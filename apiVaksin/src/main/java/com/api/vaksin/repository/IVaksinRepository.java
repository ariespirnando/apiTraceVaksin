package com.api.karyawan.repository;

import java.util.List;

import com.api.karyawan.models.Karyawan;

public interface IKaryawanRepository { 
    public List<Karyawan> findAllKaryawan();
    public Karyawan findKaryawanById(int id);
}
