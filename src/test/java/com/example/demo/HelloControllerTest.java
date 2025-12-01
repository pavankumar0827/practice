package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String result = controller.sayHello();
        assertEquals("Hello from Jenkin + Maven project!", result);
    }
}
