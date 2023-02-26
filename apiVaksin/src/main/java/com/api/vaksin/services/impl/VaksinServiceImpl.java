package com.api.vaksin.services.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		List<Vaksin> vaksins = vaksinRepository.findVaksinByIdKaryawan(id);
		
		for (Vaksin v : vaksins) { 
			List<String> convertedNmVaksinToList = Stream.of(v.getNmVaksin().split("\\|")) 
				.collect(Collectors.toList());
			v.setNmVaksins(convertedNmVaksinToList);
		}
 
		
		return vaksins;
	}
    
}
