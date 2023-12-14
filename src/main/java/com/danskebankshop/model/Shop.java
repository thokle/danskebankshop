package com.danskebankshop.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shop  {
    private String _name;
    private int id;

    private List<User> _userList = new ArrayList<>();

    private Schedule _schedule = new Schedule();
}
