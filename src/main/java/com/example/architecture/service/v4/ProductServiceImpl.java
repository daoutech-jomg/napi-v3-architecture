package com.example.architecture.service.v4;

import com.example.architecture.service.v4.filter.ContextHolder;
import com.example.architecture.service.v4.operation.ProductOperationBundle;
import com.example.architecture.service.v4.operation.ProductOperationBundleFactory;
import com.example.architecture.service.v4.operation.ProductReadOperator;
import com.example.architecture.service.v4.operation.ProductWriteOperator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductOperationBundleFactory productOperationBundleFactory;

    @Override
    public Object get() {
        ProductOperationBundle productOperationBundle = productOperationBundleFactory.create(getClientType());
        ProductReadOperator reader = productOperationBundle.readOperator();
        return reader.read();
    }

    @Override
    public void save() {
        ProductOperationBundle productOperationBundle = productOperationBundleFactory.create(getClientType());
        ProductWriteOperator productWriteOperator = productOperationBundle.writeOperator();
        productWriteOperator.save();
    }

    @Override
    public void update() {
        ProductOperationBundle productOperationBundle = productOperationBundleFactory.create(getClientType());
        ProductWriteOperator productWriteOperator = productOperationBundle.writeOperator();
        productWriteOperator.update();
    }

    private String getClientType() {
        return ContextHolder.threadLocal.get();
    }

}
