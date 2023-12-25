package com.programmingtechie.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programmingtechie.productservicemodel.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
