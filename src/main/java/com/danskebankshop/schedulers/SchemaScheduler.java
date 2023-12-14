package com.danskebankshop.schedulers;

import com.danskebankshop.services.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchemaScheduler {



    private IScheduleService iScheduleService;
    @Autowired
    public SchemaScheduler(IScheduleService iScheduleService){
        this.iScheduleService = iScheduleService;
    }

    //Køre hver time
    @Scheduled(cron = "* * * * *")
    public void updateWorkHours(){
        this.iScheduleService.updateWorkHoursOnWorkers();
    }

    //Køre fem over hver time
    @Scheduled(cron = "5 * * * *")
    public void sendPeopleHome(){
        this.iScheduleService.removeUserIfWorkerMoreThanEightHours();
    }
}
