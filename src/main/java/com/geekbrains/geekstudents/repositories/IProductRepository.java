package com.geekbrains.geekstudents.repositories;

import com.geekbrains.geekstudents.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Long> {
    @Query(value = "select id, category_id, title, price from products", nativeQuery = true)
    List<Product> getProductsByMyQuery();
}
