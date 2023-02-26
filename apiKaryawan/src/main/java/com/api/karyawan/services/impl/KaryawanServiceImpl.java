package com.api.karyawan.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.karyawan.models.Karyawan;
import com.api.karyawan.models.Vaksin; 
import com.api.karyawan.repository.IKaryawanRepository;
import com.api.karyawan.services.IKaryawanService;

@Service
public class KaryawanServiceImpl implements IKaryawanService{

    @Autowired
    private IKaryawanRepository karyawanRepository; 

	@Autowired
	private RestTemplate restTemplate;
 
	@Override
	public List<Karyawan> findAllKaryawan() { 
		return karyawanRepository.findAllKaryawan();
	}

	@Override
	public Karyawan findKaryawanById(int id) {  

		ResponseEntity<List<Vaksin>> responseEntity = 
			restTemplate.exchange(
				"http://localhost:8882/api/vaksin/trace/"+id,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Vaksin>>() {}
			);
		List<Vaksin> vaksinss = responseEntity.getBody(); 

		Karyawan karyawan = karyawanRepository.findKaryawanById(id);
		if(vaksinss!=null){
			karyawan.setVaksin(vaksinss);
		}

		return karyawan;
	}
    
}
