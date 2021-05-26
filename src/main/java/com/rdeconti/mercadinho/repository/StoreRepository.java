package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.ContactModel;
import com.rdeconti.mercadinho.models.StoreModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

public interface StoreRepository extends CrudRepository<StoreModel, String> {
}
