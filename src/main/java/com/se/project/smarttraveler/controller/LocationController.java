package com.se.project.smarttraveler.controller;

import com.google.type.LatLng;
import com.se.project.smarttraveler.model.Location;
import com.se.project.smarttraveler.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @PostMapping("/location")
    public Location getLocation(@Valid @RequestBody Location location) {

        return locationRepository.save(location);
    }

}
