/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.PaymentEntity;
import com.mycompany.spring_mvc_project_final.repository.PaymentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    
    public PaymentEntity getPaymentById (int id) {
        Optional <PaymentEntity> optional = paymentRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else { 
            return new PaymentEntity();
        }
    }
    
    public List <PaymentEntity> getListOfPayment () { 
        return (List<PaymentEntity>) paymentRepository.findAll();
    }
    
    
    public void savePayment (PaymentEntity payment) { 
        paymentRepository.save(payment);
    }
}
