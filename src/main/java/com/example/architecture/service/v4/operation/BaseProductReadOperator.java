package com.example.architecture.service.v4.operation;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@RequiredArgsConstructor
public class BaseProductReadOperator implements ProductReadOperator {

    @Override
    public Object read() {
        System.out.println("Base Product Service get");
        return Map.of("TEST", "1234");
    }
}
