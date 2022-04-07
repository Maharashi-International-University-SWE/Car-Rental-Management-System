package com.mpp.backend.services;

import com.mpp.backend.model.CarBrand;

import java.util.List;

public interface CarBrandService {
    List<CarBrand> findAll();
    CarBrand findById(Long brandId);
    CarBrand createBrand(CarBrand carBrand);
}
