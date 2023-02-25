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
	public List<Vaksin> findAllKaryawan() {
		return jdbcTemplate.query("SELECT * from tutorials", BeanPropertyRowMapper.newInstance(Vaksin.class));
	}

	@Override
	public Vaksin findKaryawanById(int id) {
		try {
			Vaksin karyawan = jdbcTemplate.queryForObject("SELECT * FROM tutorials WHERE id=?",
	            BeanPropertyRowMapper.newInstance(Vaksin.class), id); 
	        return karyawan;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
	}
    
}
