package com.app.product.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@RestController
public class ProductController {

    @GetMapping("/products/")
    public Object getProducts(){
        return ResponseEntity.ok(new String[]{"Product-1", "Product-2"});
    }

    @GetMapping("/products/user/{id}}")
    public Object getUserProducts(@PathParam("id")String id){
        return ResponseEntity.ok(new String[]{"Product-User-1", "Product-User-2"});
    }
}
