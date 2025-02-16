package com.example.architecture.controller.v1;

import com.example.architecture.service.v1.ProductServiceFactory1;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v1")
@RestController
@RequiredArgsConstructor
public class ProductController1 {

    private final ProductServiceFactory1 productServiceFactory;

    @GetMapping("")
    public ResponseEntity<?> getProduct(HttpServletRequest request) {
        return ResponseEntity.ok(productServiceFactory.create(request.getHeader("clientType")).get());
    }

    @PostMapping("")
    public ResponseEntity<?> saveProduct(HttpServletRequest request) {
        productServiceFactory.create(request.getHeader("clientType")).save();
        return ResponseEntity.ok().build();
    }

    @PutMapping("")
    public ResponseEntity<?> updateProduct(HttpServletRequest request) {
        productServiceFactory.create(request.getHeader("clientType")).update();
        return ResponseEntity.ok().build();
    }

}
