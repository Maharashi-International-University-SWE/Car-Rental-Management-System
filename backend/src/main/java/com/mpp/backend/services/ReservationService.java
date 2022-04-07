package com.mpp.backend.services;

import com.mpp.backend.dto.ReservationDTO;
import com.mpp.backend.exception.CustomException;
import com.mpp.backend.model.Reservation;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    Reservation findById(Long reservationId);
    List<Reservation> findAllReservations();
    List<Reservation> findAllByCarId(Long carId);
    List<Reservation> findAllByCustomerId(Long customerId);
    Reservation confirm(Long reservationId) throws CustomException;
    Reservation cancel(Long reservationId) throws CustomException;
    Reservation makerInProgress(Long reservationId) throws CustomException;
    Reservation findByPickupDateAndUserId(LocalDate pickupDate, Long userId);
    Reservation makeReservationCompleted(Long reservationId) throws CustomException;
    Reservation create(ReservationDTO reservation, User loggedInUser) throws CustomException;
    Reservation update(Long reservationId, ReservationDTO reservation) throws CustomException;
}
