package com.example.architecture.service.v3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductServiceFactory3 {

    private final BaseProductService baseProductServiceImpl;
    private final BaseProductService customProductServiceImpl;

    public BaseProductService create(String clientType) {
        switch (clientType) {
            case "BASE":
                return baseProductServiceImpl;
            case "CUSTOM":
                return customProductServiceImpl;
            default:
                throw new IllegalStateException();
        }
    }

}
