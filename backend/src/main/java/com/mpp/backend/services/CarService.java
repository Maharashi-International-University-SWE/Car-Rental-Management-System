package com.mpp.backend.services;

import com.mpp.backend.model.Car;
import com.mpp.backend.model.CarModel;
import com.mpp.backend.dto.CarDTO;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    Car findById(Long carId);
    Car createCar(CarDTO car);
    Car updateCar(Long carId, Car car);
    List<Car> findCarsByYear(String year);
    List<Car> findAllByBrandName(String make);
    List<Car> findAllByModel(CarModel carModel);
}
