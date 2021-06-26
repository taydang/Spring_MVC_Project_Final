/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.CreditCardEntity;
import com.mycompany.spring_mvc_project_final.repository.CreditCardRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CreditCardService {
    
    @Autowired
    private CreditCardRepository creditCardRepository;
    
    public CreditCardEntity getCreditCardById (int id) { 
      Optional <CreditCardEntity> optional =   creditCardRepository.findById(id);
      if (optional.isPresent()) {
          return optional.get();
      } else {
          return new CreditCardEntity();
      }
        
    }
    
    public List <CreditCardEntity> getListOfCreditCard () {
        return (List<CreditCardEntity>) creditCardRepository.findAll();
    }
}
