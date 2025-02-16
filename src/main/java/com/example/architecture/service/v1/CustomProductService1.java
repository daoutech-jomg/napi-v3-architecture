package com.example.architecture.service.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomProductService1 implements ProductService1 {

    private final ProductService1 baseProductService;

    @Override
    public Object get() {
        return baseProductService.get();
    }

    @Override
    public void save() {
        System.out.println("Custom Product Service save");
    }

    @Override
    public void update() {
        System.out.println("Custom Product Service update");
    }
}
