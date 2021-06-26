/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.ImageEntity;
import com.mycompany.spring_mvc_project_final.entities.RoomTypeEntity;
import com.mycompany.spring_mvc_project_final.entities.ServiceEntity;
import com.mycompany.spring_mvc_project_final.repository.ImageRepository;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Admin
 */
@Service
public class ImageService {
    
    @Autowired
    private ImageRepository imageRepository;
    
     public List<ImageEntity> uploadImage(MultipartFile[] files, HttpServletRequest request, RoomTypeEntity roomType, ServiceEntity service) {
        List<ImageEntity> images = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            try {
                byte[] bytes = file.getBytes();
                
                ServletContext context = request.getServletContext();
                String pathUrl = context.getRealPath("/images");
                
                int index = pathUrl.indexOf("target");
                String pathFolder = pathUrl.substring(0, index) + "src\\main\\webapp\\resources\\images\\";
                Path path = Paths.get(pathFolder + file.getOriginalFilename());
                Files.write(path, bytes);

                // get file name
                String name = file.getOriginalFilename();
                
                if (name == null) {
                    name = "new-image" + name;
                }
                
                ImageEntity image = new ImageEntity();
                image.setName(name);
                image.setRoomType(roomType);
                image.setService(service);
                images.add(image);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return images;
    }
    
    public ImageEntity save(ImageEntity image) {
        return imageRepository.save(image);
    }
    
}
