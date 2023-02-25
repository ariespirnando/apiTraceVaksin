package com.api.karyawan.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.api.karyawan.models.Karyawan;
import com.api.karyawan.repository.IKaryawanRepository;

@Repository
public class KaryawanRepositoryImpl implements IKaryawanRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
 
	@Override
	public List<Karyawan> findAllKaryawan() {
		return jdbcTemplate.query("SELECT * from tutorials", BeanPropertyRowMapper.newInstance(Karyawan.class));
	}

	@Override
	public Karyawan findKaryawanById(int id) {
		try {
			Karyawan karyawan = jdbcTemplate.queryForObject("SELECT * FROM tutorials WHERE id=?",
	            BeanPropertyRowMapper.newInstance(Karyawan.class), id); 
	        return karyawan;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
	}
    
}
