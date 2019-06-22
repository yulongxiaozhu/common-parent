package com.zjmlw.solr.web.service.impl;

import com.zjmlw.solr.dao.mapper.UserMapper;
import com.zjmlw.solr.dao.model.UserModel;
import com.zjmlw.solr.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserModel> getUserList() {
        return userMapper.getUserModel();
    }

    public UserModel getUser(){return null;}
}
