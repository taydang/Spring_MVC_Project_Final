/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.RoomEntity;
import com.mycompany.spring_mvc_project_final.entities.RoomTypeEntity;
import com.mycompany.spring_mvc_project_final.enums.CommonStatus;
import com.mycompany.spring_mvc_project_final.repository.RoomTypeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class RoomTypeService {
    
    @Autowired
    private RoomTypeRepository roomTypeRepository;
    
    @Autowired
    private RoomService roomService;
            
    
    // get, add, change status, update: 
    
    // get: 
    public RoomTypeEntity getRoomTypeById (int id) {
        Optional <RoomTypeEntity> optional = roomTypeRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new RoomTypeEntity();
        }
    }
    
    public List <RoomTypeEntity> getListOfRoomType () {
        return (List <RoomTypeEntity>) roomTypeRepository.findAll();
    }
    
    //add, update: 
    public void saveRoomType (RoomTypeEntity roomType) { 
        roomTypeRepository.save(roomType);
    }
    
    //change status: C
    public void changeRoomTypeStatus (int id, CommonStatus status) {
      RoomTypeEntity roomType =  getRoomTypeById(id);
      roomType.setRoomTypeStatus(status);
        saveRoomType(roomType);
      
        
    }
}
