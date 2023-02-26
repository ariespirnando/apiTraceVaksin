package com.api.vaksin.controllers;

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

import com.api.vaksin.models.Vaksin;
import com.api.vaksin.services.IVaksinService;

@RestController
@RequestMapping("/api/vaksin") 
public class VaksinController {

    private static final Logger logger = LoggerFactory.getLogger(VaksinController.class);

    @Autowired
    private IVaksinService vaksinServices; 
 
    @GetMapping("/trace/{idKaryawan}")
    public ResponseEntity<List<Vaksin>> getVaksinByIDKaryawan(@PathVariable("idKaryawan") int id){  
        List<Vaksin> vaksin = new ArrayList<Vaksin>();
    	List<Vaksin> dtVaksin = vaksinServices.findVaksinByIdKaryawan(id);  
        dtVaksin.forEach(vaksin::add); 
    	logger.info("Trace Vaksin");
    	return new ResponseEntity<>(vaksin,HttpStatus.OK);  
    } 
}