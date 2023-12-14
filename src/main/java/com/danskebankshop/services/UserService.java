package com.danskebankshop.services;

import com.danskebankshop.model.ShopManagementDataBase;
import com.danskebankshop.model.User;
import com.danskebankshop.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Override
    public Optional<User> addUser(User user) {

        ShopManagementDataBase.getUsers().add(user);
        return Optional.of(user);

    }

    @Override
    public Optional<User> getUser(String name) {
        return ShopManagementDataBase.getUsers().stream().filter(user -> user.getName().equals(name)).findFirst();
    }
}
