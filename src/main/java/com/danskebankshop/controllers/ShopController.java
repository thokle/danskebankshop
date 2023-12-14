package com.danskebankshop.controllers;

import com.danskebankshop.model.Shop;
import com.danskebankshop.services.interfaces.IScheduleService;
import com.danskebankshop.services.interfaces.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/shop")
public class ShopController {

    IShopService  iShopService;

    @Autowired
    public ShopController(IShopService iShopService){
     this.iShopService = iShopService;
    }

    @PostMapping("/create")
    public Optional<Shop> create(@RequestBody Shop shop){
        return this.iShopService.addShop(shop);
    }

    @GetMapping("/getById{id}")
    public Optional<Shop> getShopById(int id){
        return this.iShopService.getShopById(id);
    }
}
