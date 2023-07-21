package com.example.demo;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Thing")
public record Thing(String name, String id) { }
