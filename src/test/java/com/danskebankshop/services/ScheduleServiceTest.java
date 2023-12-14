package com.danskebankshop.services;

import com.danskebankshop.model.Schedule;
import com.danskebankshop.model.Shop;
import com.danskebankshop.model.ShopManagementDataBase;
import com.danskebankshop.model.User;
import com.danskebankshop.services.interfaces.IScheduleService;
import org.aspectj.apache.bcel.classfile.Module;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.awaitility.Awaitility.given;
import static org.junit.jupiter.api.Assertions.*;



@ExtendWith(MockitoExtension.class)

class ScheduleServiceTest {



    ScheduleService iScheduleService;

    private User user1;
    private User usere2;



    @Test
    public void AddUserToAnotherScheduleWhenAlreadyIsOnASchedule() throws Exception {
iScheduleService = new ScheduleService();
        var user1 =  User.builder().build();
        var user3 = User.builder().build();
        var schedue = Schedule.builder().user(user3).build();
        var schedule2 = Schedule.builder().user(user1).build();

        var shop1 = Shop.builder()._schedule(schedue)._name("test").build();

        var shop2 = new Shop();
        ShopManagementDataBase.getShopList().add(shop1);
        ShopManagementDataBase.getShopList().add(shop2);
        ShopManagementDataBase.getShopList().stream();
       var res =  iScheduleService.addUserToScheduleShop(user1, "test");

        Assertions.assertNull(res);
    }


}