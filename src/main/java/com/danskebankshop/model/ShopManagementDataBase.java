package com.danskebankshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class ShopManagement {
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
