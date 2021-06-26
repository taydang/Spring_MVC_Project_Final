/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author AnhLe
 */
@Controller
public class FileUploadController {

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody
    String uploadFileHandler(
            @RequestParam("file") MultipartFile file, HttpSession session, HttpServletRequest request) {

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                // Creating the directory to store file
                ServletContext context = request.getServletContext();
                String pathUrl = context.getRealPath("/images");

                int index = pathUrl.indexOf("target");
                String pathFolder = pathUrl.substring(0, index) + "src\\main\\webapp\\resources\\images\\";
                Path path = Paths.get(pathFolder + file.getOriginalFilename());
                Files.write(path, bytes);

                // sau khi upload file xong lấy file name ra để insert vào database
                String name = file.getOriginalFilename();

                return "You successfully uploaded file=" + name;
            } catch (Exception e) {
                return "You failed to upload " + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload "
                    + " because the file was empty.";
        }
    }

    /**
     * Upload multiple file using Spring Controller
     */
    @RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
    public @ResponseBody
    String uploadMultipleFileHandler(HttpServletRequest request,
            @RequestParam("file") MultipartFile[] files) {
        if (files != null && files.length > 0) {
            String message = "";
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

                    // sau khi upload file xong lấy file name ra để insert vào database
                    String name = file.getOriginalFilename();

                    message = message + "You successfully uploaded file=" + name
                            + "<br />";
                } catch (Exception e) {
                    message = message + "You failed to upload  => " + e.getMessage();
                }
            }
            return message;
        } else {
            return "You failed to upload "
                    + " because the file was empty.";
        }
    }
}
