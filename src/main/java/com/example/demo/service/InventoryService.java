package com.example.demo.service;


import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class InventoryService {

    @Autowired
    private final InhousePartRepository inhousePartRepository;

    @Autowired
    private final ProductRepository productRepository;

    public void initializeSampleInventory() {
        if (inhousePartRepository.count() == 0 && productRepository.count() == 0) {
            InhousePart inhousePart1 = createInhousePart("1TB SSD", 100.00, 10, 1, 25);
            InhousePart inhousePart2 = createInhousePart("2TB SSD", 165.00, 10, 1, 25);
            InhousePart inhousePart3 = createInhousePart("2TB M2 NVMe", 185.00, 10, 1, 25);
            InhousePart inhousePart4 = createInhousePart("DDR5 RAM 32GB", 175.00, 10, 1, 25);
            InhousePart inhousePart5 = createInhousePart("DDR5 RAM 64GB", 250.00, 10, 1, 25);

            Product product1 = createProduct("i5 Intel PC", 300.00, 8);
            Product product2 = createProduct("i7 Intel PC", 500.00, 8);
            Product product3 = createProduct("i9 Intel PC", 700.00, 8);
            Product product4 = createProduct("r7 AMD PC", 450.00, 8);
            Product product5 = createProduct("r9 AMD PC", 650.00, 8);

            inhousePartRepository.saveAll(List.of(inhousePart1, inhousePart2, inhousePart3, inhousePart4, inhousePart5));


            productRepository.saveAll(List.of(product1, product2, product3, product4, product5));
        }
    }

    private InhousePart createInhousePart(String name, double price, int inv, int minInv, int maxInv) {
        InhousePart inhousePart = new InhousePart();
        inhousePart.setName(name);
        inhousePart.setPrice(price);
        inhousePart.setInv(inv);
        inhousePart.setMinInv(minInv);
        inhousePart.setMaxInv(maxInv);
        return inhousePart;
    }

    private Product createProduct(String name, double price, int inv) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setInv(inv);
        return product;
    }
}
