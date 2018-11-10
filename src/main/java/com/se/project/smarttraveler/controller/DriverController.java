package com.se.project.smarttraveler.controller;

import com.se.project.smarttraveler.model.Driver;
import com.se.project.smarttraveler.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

    @Autowired
    DriverRepository driverRepository;


    @GetMapping("/drivers")
    public List<Driver> getAllDrivers() {

        //return commonRepository.findAll();
        return driverRepository.findAll();
    }


    @PostMapping("/drivers")
    public Driver createDriver(@Valid @RequestBody Driver driver) {

        return driverRepository.save(driver);
    }

    /*public void getDriverFromFirebaseDatabase() {

        String uri = "https://smarttraveler-6b8f0.firebaseio.com/Users/UUoDWMbTL6UmbgEbjjE1iJzJXqw2.json";
        RestTemplate restTemplate = new RestTemplate();
        Driver driver = restTemplate.getForObject(uri, Driver.class);
        String name = driver.getDriverName();
        System.out.println(name);
    }*/

}
