/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.CommentEntity;
import com.mycompany.spring_mvc_project_final.repository.CommentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    
    //get, add, delete
    public CommentEntity getCommentById (int id) { 
        Optional <CommentEntity> optional = commentRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else {
            return new CommentEntity();
        }
    }
    
    public List <CommentEntity> getListOfComment () {
        return (List<CommentEntity>) commentRepository.findAll();
    }
    
    public void saveComment (CommentEntity comment) { 
        commentRepository.save(comment);
    }
    
    public boolean deleteById (int id) { 
        commentRepository.deleteById(id);
        return commentRepository.existsById(id);
    }
}
