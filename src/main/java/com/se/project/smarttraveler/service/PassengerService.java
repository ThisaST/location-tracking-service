package com.se.project.smarttraveler.service;

import com.se.project.smarttraveler.model.Passenger;

public interface PassengerService {

    Passenger getPassengerById(Long id);

    Passenger createPassenger(Passenger passenger);

    Passenger updatePassenger();
}
