package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.InventoryModel;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<InventoryModel, String> {

    public InventoryModel findByCodigo(Integer codigo);

}
