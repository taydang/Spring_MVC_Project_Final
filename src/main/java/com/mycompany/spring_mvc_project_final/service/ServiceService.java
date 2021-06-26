/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.ServiceEntity;
import com.mycompany.spring_mvc_project_final.enums.CommonStatus;
import com.mycompany.spring_mvc_project_final.repository.ServiceRepository;
import static java.nio.file.Paths.get;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    
    public ServiceEntity getServiceById (int id) { 
        Optional <ServiceEntity> optional = serviceRepository.findById(id);
         if (optional.isPresent()) {
             return optional.get();
         } else { 
             return new ServiceEntity();
         }
    }
    
    
    public List <ServiceEntity> getListOfService () { 
        return (List<ServiceEntity>) serviceRepository.findAll();
    }
    
    public void saveService (ServiceEntity service) {
        serviceRepository.save(service);
        
        
    }
    
  public void changeServiceStatus (int id, CommonStatus status) { 
        ServiceEntity service =  getServiceById(id);
        service.setServiceStatus(status);
        saveService(service);
        
              
  }
}
