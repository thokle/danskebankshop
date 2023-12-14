package com.danskebankshop.services.interfaces;

import com.danskebankshop.model.Shop;

import java.util.Optional;

public interface IShopService {

    Optional<Shop> addShop(Shop shop);

    Optional<Shop> getShopById(int id);

    Optional<Shop> getShopByName(String name);
}
