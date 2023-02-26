package com.api.vaksin.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.api.vaksin.models.Vaksin;
import com.api.vaksin.repository.IVaksinRepository;

@Repository
public class VaksinRepositoryImpl implements IVaksinRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
  
	@Override
	public List<Vaksin> findVaksinByIdKaryawan(int id) {
		return jdbcTemplate.query("SELECT v.jenisVaksin, GROUP_CONCAT(vd.namaVaksin ORDER BY vd.idVaksinDetail SEPARATOR '|') AS nmVaksin  FROM vaksinkaryawan vk JOIN vaksindetail vd ON vk.idVaksinDetail = vd.idVaksinDetail JOIN vaksin v ON v.idVaksin = vd.idVaksin WHERE vk.idKaryawan = ? GROUP BY v.jenisVaksin", 
				BeanPropertyRowMapper.newInstance(Vaksin.class), id); 
	}
    
}
