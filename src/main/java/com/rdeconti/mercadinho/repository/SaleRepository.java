package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.ContactModel;
import com.rdeconti.mercadinho.models.SaleModel;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<SaleModel, String> {
}
