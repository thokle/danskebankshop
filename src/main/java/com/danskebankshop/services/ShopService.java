package com.danskebankshop.services;

import com.danskebankshop.model.Shop;
import com.danskebankshop.model.ShopManagementDataBase;
import com.danskebankshop.services.interfaces.IShopService;

import java.util.Optional;

public class ShopService implements IShopService {
    @Override
    public Optional<Shop> addShop(Shop shop) {
         ShopManagementDataBase.getShopList().add(shop);
        return Optional.of(shop);
    }

    @Override
    public Optional<Shop> getShopById(int id) {
        return ShopManagementDataBase.getShopList().stream().filter(shop -> shop.getId() == id).findFirst();
    }

    @Override
    public Optional<Shop> getShopByName(String name) {
        return ShopManagementDataBase.getShopList().stream().filter(shop -> shop.get_name().toLowerCase().equals(name.toLowerCase())).findFirst();
    }
}
