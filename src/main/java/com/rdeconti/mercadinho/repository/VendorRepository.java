package com.rdeconti.mercadinho.repository;

import com.rdeconti.mercadinho.models.ContactModel;
import com.rdeconti.mercadinho.models.VendorModel;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<VendorModel, String> {
}
