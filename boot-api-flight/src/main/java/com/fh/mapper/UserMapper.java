package com.fh.mapper;

import com.fh.model.User;

public interface UserMapper {
    User getUserByLoginname(String username);

    User getUserById(Integer id);
}
