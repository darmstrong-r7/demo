package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Thingy {

    @Autowired
    ThingRepo thingRepo;

    public Thing addThing(Thing t) {
        return thingRepo.save(t);
    }

    public List<Thing> getThings(){
        List<Thing> list = new ArrayList<>();
        thingRepo.findAll().forEach(list::add);
        return list;
    }
}
