package com.example.architecture.service.v4.operation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BaseProductWriteOperator implements ProductWriteOperator {

    @Override
    public void save() {
        System.out.println("Base Product Service save");
    }

    @Override
    public void update() {
        System.out.println("Base Product Service update");
    }

}
