/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.ConvenientEntity;
import com.mycompany.spring_mvc_project_final.repository.ConvenientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ConvenientService {
    
    @Autowired
    private ConvenientRepository convenientRepository;
    
    public ConvenientEntity getConvenientById (int id) {
        Optional <ConvenientEntity> optional = convenientRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else {
            return new ConvenientEntity();
        }
    }
    
    public List <ConvenientEntity> getListOfConvenient () {
        return (List<ConvenientEntity>) convenientRepository.findAll();
    }
}
