package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ThingRepo extends CrudRepository<Thing, String> {
}
