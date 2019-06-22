package com.zjmlw.solr.web.service;


import com.zjmlw.solr.dao.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getUserList();

    UserModel getUser();
}
