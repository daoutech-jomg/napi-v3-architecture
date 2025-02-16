package com.example.architecture.service.v4.operation;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductOperationBundleFactory {

    @Qualifier("baseProductReadOperator")
    private final ProductReadOperator baseProductReadOperator;

    @Qualifier("baseProductWriteOperator")
    private final ProductWriteOperator baseProductWriteOperator;

    @Qualifier("customProductWriteOperator")
    private final ProductWriteOperator customProductWriteOperator;


    public ProductOperationBundle create(String clientType) {
        switch (clientType) {
            case "BASE":
                return new ProductOperationBundle(
                    baseProductReadOperator,
                    baseProductWriteOperator
                );
            case "CUSTOM":
                return new ProductOperationBundle(
                    baseProductReadOperator,
                    customProductWriteOperator
                );
            default:
                throw new IllegalStateException();
        }
    }

}
