package com.se.project.smarttraveler.service.impl;

import com.se.project.smarttraveler.model.PinnedLocation;
import com.se.project.smarttraveler.repository.PinnedLocationRepository;
import com.se.project.smarttraveler.service.PinnedLocationService;
import org.springframework.beans.factory.annotation.Autowired;

public class PinnedLocationServiceImpl implements PinnedLocationService {

    @Autowired
    private PinnedLocationRepository pinnedLocationRepository;

    @Override
    public PinnedLocation saveLocations(PinnedLocation pinnedLocation) {

        return pinnedLocationRepository.save(pinnedLocation);
    }
}
