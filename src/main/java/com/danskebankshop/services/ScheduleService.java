package com.danskebankshop.services;

import com.danskebankshop.model.Schedule;
import com.danskebankshop.model.ShopManagementDataBase;
import com.danskebankshop.model.User;
import com.danskebankshop.services.interfaces.IScheduleService;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ScheduleService implements IScheduleService {

    //add user to schedule Shop

    private ShopManagementDataBase shopManagement;
    public Schedule addUserToScheduleShop(User user, String name) throws Exception {
        try {
            if (!isUserAtWorkInAnotherShop(user)) {
                val shopStream = ShopManagementDataBase.getShopList().stream().filter(shop -> shop.get_name().toLowerCase(Locale.ROOT).equals(name.toLowerCase(Locale.ROOT))).findFirst();
                val schedule = shopStream.get().get_schedule();
                return schedule;
            }
        } catch (Exception exception){
            throw new Exception("Add User to Schedule Shop" + exception.getLocalizedMessage());
        }
        return null;
    }
    public boolean isUserAtWorkInAnotherShop(User user){

    val first = ShopManagementDataBase.getShopList().stream().anyMatch(shop1 -> shop1.get_schedule().getUsers().contains(user));
    return  first;

    }

    public void updateWorkHoursOnWorkers(){
        ShopManagementDataBase.getShopList().stream().forEach(shop -> shop.get_schedule().getUsers().forEach(user -> {
            user.setHours_of_work(user.getHours_of_work() +1);
        }));
    }


    public void removeUserIfWorkerMoreThanEightHours(){
         ShopManagementDataBase.getShopList().forEach(shop -> shop.get_schedule().getUsers().removeIf(user -> user.getHours_of_work() >=8));
    }
    //check if user work more than 5 days

}
