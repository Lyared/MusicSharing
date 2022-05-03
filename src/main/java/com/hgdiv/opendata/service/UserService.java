package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
