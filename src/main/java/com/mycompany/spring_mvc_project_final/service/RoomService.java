/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.BookingDetailEntity;
import com.mycompany.spring_mvc_project_final.entities.RoomEntity;
import com.mycompany.spring_mvc_project_final.enums.CommonStatus;
import com.mycompany.spring_mvc_project_final.repository.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
    
    @Autowired
    private BookingDetailService bookingDetailService;
            
    
    //get, add, update, change status: 
    
    //get all
    public List <RoomEntity> getListOfRoom () {
        return (List<RoomEntity>) roomRepository.findAll();       
    }
    
    // get by ID: 
    public RoomEntity getRoomById (int id)  {
        Optional <RoomEntity> optional = roomRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else {
            return new RoomEntity();
        }
    }
    
    //add, save: 
    public void saveRoom (RoomEntity room) { 
        roomRepository.save(room);
        bookingDetailService.saveBookingDetail((BookingDetailEntity) room.getBookingDetails());
                
    }
    
    // change status: 
    public void changeRoomStatus  (int id, CommonStatus status )  {
        RoomEntity room = getRoomById(id);
        room.setRoomStatus (status) ;
        saveRoom(room);
        
    }
    
    
}
