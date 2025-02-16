package com.example.architecture.controller.v4;

import com.example.architecture.service.v4.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v4")
@RestController
@RequiredArgsConstructor
public class ProductController4 {

    private final ProductService productService;

    @GetMapping("")
    public ResponseEntity<?> getProduct(HttpServletRequest request) {
        return ResponseEntity.ok(productService.get());
    }

    @PostMapping("")
    public ResponseEntity<?> saveProduct(HttpServletRequest request) {
        productService.save();
        return ResponseEntity.ok().build();
    }

    @PutMapping("")
    public ResponseEntity<?> updateProduct(HttpServletRequest request) {
        productService.update();
        return ResponseEntity.ok().build();
    }

    private String getClientType(HttpServletRequest request) {
        return request.getHeader("clientType");
    }

}
