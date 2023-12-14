package com.danskebankshop.services.interfaces;

import com.danskebankshop.model.Schedule;
import com.danskebankshop.model.Shop;
import com.danskebankshop.model.User;

public interface IScheduleService {

     Schedule  addUserToScheduleShop(User user, String name) throws Exception;
      void updateWorkHoursOnWorkers();
      void removeUserIfWorkerMoreThanEightHours();
}
