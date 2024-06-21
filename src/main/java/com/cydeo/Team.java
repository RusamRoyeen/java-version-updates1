package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;

    private List<Player> members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
