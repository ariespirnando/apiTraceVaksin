package com.api.karyawan.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.karyawan.models.Karyawan;
import com.api.karyawan.repository.IKaryawanRepository;
import com.api.karyawan.services.IKaryawanService;

@Service
public class KaryawanServiceImpl implements IKaryawanService{

    @Autowired
    private IKaryawanRepository karyawanRepository; 
    
	@Override
	public List<Karyawan> findAllKaryawan() { 
		return karyawanRepository.findAllKaryawan();
	}

	@Override
	public Karyawan findKaryawanById(int id) { 
		return karyawanRepository.findKaryawanById(id);
	}
    
}
