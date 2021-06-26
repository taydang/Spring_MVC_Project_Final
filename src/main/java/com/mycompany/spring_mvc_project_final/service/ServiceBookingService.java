/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.ServiceBookingEntity;
import com.mycompany.spring_mvc_project_final.repository.ServiceBookingRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ServiceBookingService {
    
    @Autowired
    private ServiceBookingRepository serviceBookingRepository;
    
    public ServiceBookingEntity getServiceBookingById (int id) { 
        Optional <ServiceBookingEntity> optional = serviceBookingRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new ServiceBookingEntity();
        }
    }
    
    public List <ServiceBookingEntity> getListOfServiceBooking () {
        return (List<ServiceBookingEntity>) serviceBookingRepository.findAll();
    }
    
    public void saveServiceBooking (ServiceBookingEntity serviceBooking) {
        serviceBookingRepository.save(serviceBooking);
    }
    
             
}
