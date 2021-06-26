/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.controller;

import com.mycompany.spring_mvc_project_final.utils.SecurityUtils;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {
//        model.addAttribute("title", "Welcome");
//        model.addAttribute("message", "This is welcome page!");
//        List<String> roles = SecurityUtils.getRolesOfUser();
//        if (!CollectionUtils.isEmpty(roles) && (roles.contains("ROLE_ADMIN")
//                || roles.contains("ROLE_SELLER") || roles.contains("ROLE_MANAGER"))) {
//            return "redirect:/admin/home";
//        }
        return "home";
    }
    
    @RequestMapping(value = {"/room_list"}, method = RequestMethod.GET)
    public String roomList(Model model) {
        return "room_list";
    }
    
//    @RequestMapping(value = {"/admin/home"}, method = RequestMethod.GET)
//    public String adminHome(Model model) {
//        return "admin/home";
//    }
    
    @RequestMapping(value = {"/room_detail"}, method = RequestMethod.GET)
    public String roomDetail(Model model) {
        return "room_detail";
    }

    @RequestMapping("/login")
    public String loginPage(Model model, @RequestParam(value = "error", required = false) boolean error) {
        if (error) {
            model.addAttribute("message", "Login Fail!!!");
        }
        return "login";
    }

//    @RequestMapping("/403")
//    public String accessDenied(Model model) {
//        return "403Page";
//    }
}
