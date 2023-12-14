package com.danskebankshop.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {

private WeekDays weekDays;
private Shop shop;
@Singular
private List<User> users = new ArrayList<>();

}
