package com.se.project.smarttraveler.controller;


import com.se.project.smarttraveler.exception.ResourceNotFoundException;
import com.se.project.smarttraveler.model.PinnedLocation;
import com.se.project.smarttraveler.repository.BusRouteRepository;
import com.se.project.smarttraveler.repository.PinnedLocationRepository;
import com.se.project.smarttraveler.service.BusRouteService;
import com.se.project.smarttraveler.service.PinnedLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PinPointsController {

    @Autowired
    private PinnedLocationRepository pinnedLocationService;

    @Autowired
    private BusRouteRepository busRouteRepository;

    @PostMapping("busroute/{id}/pinpoints")
    public PinnedLocation addLocations(@PathVariable(value = "id") Long id, @RequestBody PinnedLocation locations) {

        return busRouteRepository.findById(id).map(busRoute -> {

            locations.setBusRoute(busRoute);

            return pinnedLocationService.save(locations);
        }).orElseThrow(() -> new ResourceNotFoundException("PostId not found"));

        /*URI requestLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pinnedLocation.getId())
                .toUri();

        return ResponseEntity.created(requestLocation).build();*/

    }

    @GetMapping("busroute/{id}/pinpoints")
    public List<PinnedLocation> getLocationsAccordingToRoute(@PathVariable(value = "id") Long id)  {


        return pinnedLocationService.findAll();
    }
}
