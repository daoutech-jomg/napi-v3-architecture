package com.example.architecture.service.v4.operation;

import org.springframework.stereotype.Service;

@Service
public class CustomProductWriteOperator implements ProductWriteOperator {

    @Override
    public void save() {
        System.out.println("Custom Product Service save");
    }

    @Override
    public void update() {
        System.out.println("Custom Product Service update");
    }
}
