package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.ContactModel;
import com.rdeconti.mercadinho.models.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, String> {
}
