package com.se.project.smarttraveler.service.impl;

import com.se.project.smarttraveler.model.BusRoute;
import com.se.project.smarttraveler.repository.BusRouteRepository;
import com.se.project.smarttraveler.service.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {

    @Autowired
    private BusRouteRepository busRouteRepository;

    @Override
    public BusRoute createNewRoute(BusRoute busRoute) {

        return busRouteRepository.save(busRoute);
    }

    @Override
    public BusRoute getBusRouteById(Long id) {

        return busRouteRepository.getOne(id);
    }

    @Override
    public List<BusRoute> getAllBusRoutes() {

        return busRouteRepository.findAll();
    }
}
