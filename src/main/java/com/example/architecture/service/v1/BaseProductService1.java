package com.example.architecture.service.v1;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseProductService1 implements ProductService1 {

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
