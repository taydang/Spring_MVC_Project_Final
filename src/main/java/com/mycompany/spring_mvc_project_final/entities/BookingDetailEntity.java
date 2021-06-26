/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "booking_detail")
public class BookingDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //-------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private BookingEntity booking;
    
    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomEntity room;
    
    @OneToMany(mappedBy = "bookingDetail", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ServiceBookingEntity> serviceBookings;

    public BookingDetailEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BookingEntity getBooking() {
        return booking;
    }

    public void setBooking(BookingEntity booking) {
        this.booking = booking;
    }

    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public List<ServiceBookingEntity> getServiceBookings() {
        return serviceBookings;
    }

    public void setServiceBookings(List<ServiceBookingEntity> serviceBookings) {
        this.serviceBookings = serviceBookings;
    }
    
    
    
}
