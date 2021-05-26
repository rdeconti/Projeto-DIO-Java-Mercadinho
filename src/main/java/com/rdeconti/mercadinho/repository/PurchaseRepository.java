package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.ContactModel;
import com.rdeconti.mercadinho.models.PurchaseModel;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<PurchaseModel, String> {
}
