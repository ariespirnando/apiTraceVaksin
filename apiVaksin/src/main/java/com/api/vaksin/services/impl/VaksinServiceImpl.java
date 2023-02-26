package com.api.vaksin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.vaksin.models.Vaksin;
import com.api.vaksin.repository.IVaksinRepository;
import com.api.vaksin.services.IVaksinService;

@Service
public class VaksinServiceImpl implements IVaksinService{

    @Autowired
    private IVaksinRepository vaksinRepository; 
     
	@Override
	public List<Vaksin> findVaksinByIdKaryawan(int id) { 
		return vaksinRepository.findVaksinByIdKaryawan(id);
	}
    
}
