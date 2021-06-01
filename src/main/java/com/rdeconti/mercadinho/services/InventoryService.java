package com.rdeconti.mercadinho.services;

import com.rdeconti.mercadinho.models.InventoryModel;
import com.rdeconti.mercadinho.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Iterable<InventoryModel> findAll(){
        return inventoryRepository.findAll( );
    }

    public InventoryModel findById(Integer inventory_ID) {
        return inventoryRepository.findByCodigo( inventory_ID );
    }

    public void create(InventoryModel inventory){
        inventoryRepository.save( inventory );
        System.out.println("CREATION DONE WITH SUCCESS: " + inventory);
    }

    public void update(InventoryModel inventory){
        inventoryRepository.save( inventory );
        System.out.println("UPDATE DONE WITH SUCCESS " + inventory);
    }

    public void delete(Integer inventory_ID){
        InventoryModel inventory = inventoryRepository.findByCodigo( inventory_ID );
        inventoryRepository.delete( inventory );
        System.out.println("DELETE DONE WITH SUCCESS " + inventory);
    }

}