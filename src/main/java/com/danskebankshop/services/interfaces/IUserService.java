package com.danskebankshop.services.interfaces;

import com.danskebankshop.model.User;

import java.util.Optional;

public interface IUserService {
    public Optional<User> addUser(User user);

    public Optional<User> getUser(String name);
}
