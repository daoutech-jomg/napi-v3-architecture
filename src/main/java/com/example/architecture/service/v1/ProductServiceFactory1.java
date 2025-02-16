package com.example.architecture.service.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductServiceFactory1 {

    private final ProductService1 baseProductService1;
    private final ProductService1 customProductService1;

    public ProductService1 create(String clientType) {
        switch (clientType) {
            case "BASE":
                return baseProductService1;
            case "CUSTOM":
                return customProductService1;
            default:
                throw new IllegalStateException();
        }
    }
}
