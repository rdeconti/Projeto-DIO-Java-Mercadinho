package com.rdeconti.mercadinho.controllers;

import com.rdeconti.mercadinho.models.InventoryModel;
import com.rdeconti.mercadinho.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventorys")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public Iterable<InventoryModel> listar(){
        return inventoryService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody InventoryModel inventory){
        inventoryService.create(inventory);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody InventoryModel inventory){
        inventoryService.update(inventory);
    }

    @DeleteMapping
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer id){
        inventoryService.delete(id);
    }

}
