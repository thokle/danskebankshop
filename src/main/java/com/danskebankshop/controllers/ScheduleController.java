package com.danskebankshop.controllers;

import com.danskebankshop.model.Schedule;
import com.danskebankshop.model.User;
import com.danskebankshop.services.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ScheduleController {

    IScheduleService iScheduleService;
    @Autowired
    public ScheduleController(IScheduleService iScheduleService){
        this.iScheduleService  = iScheduleService;
    }

    @PostMapping(value = "/addUsertoShopSchedule/{name}")
    public Optional<Schedule> addUserToSchopSchedule(@RequestBody User user, @PathVariable("name") String name) throws Exception {
        return Optional.of(this.iScheduleService.addUserToScheduleShop(user, name));
    }


}
