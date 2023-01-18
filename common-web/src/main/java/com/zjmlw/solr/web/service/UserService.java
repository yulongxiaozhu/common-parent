package com.zjmlw.solr.web.service;


import com.zjmlw.solr.dao.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User getUser();
}
