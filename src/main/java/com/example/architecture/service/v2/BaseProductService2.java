package com.example.architecture.service.v2;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class BaseProductService2 implements ProductService2 {

    @Override
    public Object get() {
        System.out.println("Base Product Service get");
        return Map.of("TEST", "1234");
    }

    @Override
    public void save() {
        System.out.println("Base Product Service save");
    }

    @Override
    public void update() {
        System.out.println("Base Product Service update");
    }
}
