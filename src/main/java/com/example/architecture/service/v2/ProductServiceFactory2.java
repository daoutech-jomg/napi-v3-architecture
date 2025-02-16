package com.example.architecture.service.v2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductServiceFactory2 {

    private final ProductService2 baseProductService2;
    private final ProductService2 customProductService2;

    public ProductService2 create(String clientType) {
        switch (clientType) {
            case "BASE":
                return baseProductService2;
            case "CUSTOM":
                return customProductService2;
            default:
                throw new IllegalStateException();
        }
    }

}
