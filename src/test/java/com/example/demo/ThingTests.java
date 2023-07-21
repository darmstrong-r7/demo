package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ThingTests {

    @Autowired
    Thingy thingy;

    Thing myTestThing = new Thing("Foo", "bar");

    @Test
    void addThingTest() {
        var result = thingy.addThing(myTestThing);
        assertThat(result).isEqualTo(myTestThing);
    }

    @Test
    void getThingsTest() {
        var things = thingy.getThings();
        things.forEach((n) -> {
            System.out.println("Thing is " + n);
        });
        assertThat(things.get(0)).isEqualTo(myTestThing);
    }


}
