package com.se.project.smarttraveler.controller;

import com.se.project.smarttraveler.model.BusRoute;
import com.se.project.smarttraveler.service.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BusRouteController {

    @Autowired
    private BusRouteService busRouteService;

    @PostMapping("/busroute")
    public void addBusRoute(@RequestBody BusRoute route) {

        busRouteService.createNewRoute(route);
    }

    @GetMapping("busroutes")
    public List<BusRoute> getBusRoutes() {

        return busRouteService.getAllBusRoutes();

    }


}
