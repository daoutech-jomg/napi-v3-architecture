package com.example.architecture.service.v4.operation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductOperationBundle {

    private ProductReadOperator readOperator;
    private ProductWriteOperator writeOperator;

    public ProductReadOperator readOperator() {
        return readOperator;
    }

    public ProductWriteOperator writeOperator() {
        return writeOperator;
    }
}

