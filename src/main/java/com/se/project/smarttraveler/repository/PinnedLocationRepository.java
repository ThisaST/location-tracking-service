package com.se.project.smarttraveler.repository;

import com.se.project.smarttraveler.model.PinnedLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinnedLocationRepository extends JpaRepository<PinnedLocation, Long> {
}
