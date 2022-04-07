package com.mpp.backend.services;

import com.mpp.backend.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
