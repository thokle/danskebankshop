package com.danskebankshop.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopManagementDataBase {
    private static List<Shop> shopList;

    private static List<User> users;


    public static  List<Shop> getShopList(){
        if(shopList == null)
            shopList =new ArrayList<>();
        return shopList;
    }

    public static List<User> getUsers(){
        if(users == null)
            users = new ArrayList<>();
        return users;
    }
}
