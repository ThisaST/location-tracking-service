package com.se.project.smarttraveler.service;

import com.se.project.smarttraveler.model.BusRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BusRouteService {

    BusRoute createNewRoute(BusRoute busRoute);

    BusRoute getBusRouteById(Long id);

    List<BusRoute> getAllBusRoutes();
}
