package com.geekbrains.geekstudents.controllers;

import com.geekbrains.geekstudents.entities.Product;
import com.geekbrains.geekstudents.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String shopPage(Model model) {
        List<Product> allProduct = productService.getAllProducts();
        model.addAttribute("products", allProduct);
        return "products";
    }
}
