/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.PromotionEntity;
import com.mycompany.spring_mvc_project_final.enums.CommonStatus;
import com.mycompany.spring_mvc_project_final.repository.PromotionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PromotionService {
    
    @Autowired
    private PromotionRepository  promotionRepository;
    
    //get add, úpdate, change status:
    public PromotionEntity getPromotionById (int id) {
        Optional <PromotionEntity> optional = promotionRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new PromotionEntity();
        }
    }
    
    public List <PromotionEntity> getListOfPromotion () {
        return (List<PromotionEntity>) promotionRepository.findAll();
    }
    
    public void savePromotion (PromotionEntity promotion) {
        promotionRepository.save(promotion);
    }
    
    public void changePromotionStatus (int id, CommonStatus status) {
        PromotionEntity promotion = getPromotionById(id);
        promotion.setPromotionStatus(status);
        savePromotion(promotion);
    }
}
