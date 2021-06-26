/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.entities;

import com.mycompany.spring_mvc_project_final.enums.CommonStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "room_type")
public class RoomTypeEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    private String description;
    
    @Column(nullable = false, name = "room_type_status")
    @Enumerated(EnumType.STRING)
    private CommonStatus roomTypeStatus = CommonStatus.ACTIVE;
    
//    private String size;
    private Integer numberOfGuest;
    
    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    
    //---------------------------------------------
    
    @OneToMany(mappedBy = "roomType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<RoomEntity> rooms;
    
    @ManyToMany
    @JoinTable(
            name = "room_type_promotion",
            joinColumns = @JoinColumn(name = "room_type_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id"))
    private List<PromotionEntity> promotions;

    public RoomTypeEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonStatus getRoomTypeStatus() {
        return roomTypeStatus;
    }

    public void setRoomTypeStatus(CommonStatus roomTypeStatus) {
        this.roomTypeStatus = roomTypeStatus;
    }

    public Integer getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(Integer numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<RoomEntity> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    public List<PromotionEntity> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<PromotionEntity> promotions) {
        this.promotions = promotions;
    }
    
    
    
    
}
