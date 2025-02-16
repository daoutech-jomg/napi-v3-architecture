package com.example.architecture.service.v2;

import org.springframework.stereotype.Service;

@Service
public class CustomProductService2 extends BaseProductService2 {

    @Override
    public void save() {
        System.out.println("Custom Product Service save");
    }

    @Override
    public void update() {
        System.out.println("Custom Product Service update");
    }
}
