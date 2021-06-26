/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.BookingDetailEntity;
import com.mycompany.spring_mvc_project_final.repository.BookingDetailRepository;
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
public class BookingDetailService {
    
    @Autowired 
    private BookingDetailRepository bookingDetailRepository;
    
    @Autowired
    private ServiceBookingService serviceBookingService;
    
    @Autowired 
    private RoomService roomService;
    
    //get and add: 
    // Get Booking Detail: 
    public BookingDetailEntity findBookingDetailById (int id) {
        Optional<BookingDetailEntity> optional = bookingDetailRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new BookingDetailEntity();
        }
    }
    
    public List <BookingDetailEntity> findBookingDetails() {
      return (List<BookingDetailEntity>) bookingDetailRepository.findAll();
    }
    
    
    //Save: 
    public void saveBookingDetail (BookingDetailEntity bookingDetail) {
        bookingDetailRepository.save(bookingDetail);
        roomService.saveRoom(bookingDetail.getRoom());
        
    }
    
}
