package com.fh.service;

import com.fh.model.ServerResponse;
import com.fh.model.User;

public interface UserService {
    ServerResponse login(String username, String password);

    User getUserById(Integer id);
}
