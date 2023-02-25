package com.api.karyawan.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.karyawan.models.Karyawan;
import com.api.karyawan.services.IKaryawanService;

@RestController
@RequestMapping("/api/vaksin") 
public class KaryawanController {

    private static final Logger logger = LoggerFactory.getLogger(KaryawanController.class);

    @Autowired
    private IKaryawanService karyawanServices; 
 
    @GetMapping("/trace/{idKaryawan}")
    public ResponseEntity<Karyawan> getsTutorialsById(@PathVariable("idKaryawan") int id){
    	Karyawan karyawan = karyawanServices.findKaryawanById(id);  
        return new ResponseEntity<>(karyawan,HttpStatus.OK);  
    } 
}