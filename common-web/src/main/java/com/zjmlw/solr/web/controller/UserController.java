package com.zjmlw.solr.web.controller;

import com.zjmlw.solr.dao.model.User;
import com.zjmlw.solr.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/index")
    public ModelAndView getUser(ModelAndView mv) {
        List<User> userList = userService.getUserList();
        mv.addObject("userList",userList);
        mv.setViewName("index");

        return mv;
    }
}
