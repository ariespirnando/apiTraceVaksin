package com.api.vaksin.repository;

import java.util.List;
 
import com.api.vaksin.models.Vaksin;

public interface IVaksinRepository { 
    public List<Vaksin> findAllKaryawan();
    public Vaksin findKaryawanById(int id);
}
