package com.example.demo.controllers;

import com.example.demo.models.product.Product;
import com.example.demo.response.ResponseObject;
import com.example.demo.services.IService.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("")
    public ResponseEntity<ResponseObject> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok().body(
                ResponseObject.builder()
                        .status(HttpStatus.OK)
                        .message("Lấy danh sách sản phẩm thành công")
                        .data(products)
                        .build()
        );
    }
}
