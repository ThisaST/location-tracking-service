package com.se.project.smarttraveler.service;

import com.se.project.smarttraveler.model.PinnedLocation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public interface PinnedLocationService {

    PinnedLocation saveLocations(PinnedLocation pinnedLocation);
}
