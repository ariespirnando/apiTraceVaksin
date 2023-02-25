package com.api.vaksin.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.vaksin.models.Vaksin;
import com.api.vaksin.services.IVaksinService;

@RestController
@RequestMapping("/api/vaksin") 
public class VaksinController {

    private static final Logger logger = LoggerFactory.getLogger(VaksinController.class);

    @Autowired
    private IVaksinService karyawanServices; 
 
    @GetMapping("/trace/{idKaryawan}")
    public ResponseEntity<Vaksin> getsTutorialsById(@PathVariable("idKaryawan") int id){
    	Vaksin karyawan = karyawanServices.findKaryawanById(id);  
    	logger.info("Trace Vaksin");
    	return new ResponseEntity<>(karyawan,HttpStatus.OK);  
    } 
}