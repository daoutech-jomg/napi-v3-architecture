package com.example.architecture.service.v3;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class BaseProductServiceImpl implements BaseProductService {

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
