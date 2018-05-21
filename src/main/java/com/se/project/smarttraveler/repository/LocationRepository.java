package com.se.project.smarttraveler.repository;

import com.se.project.smarttraveler.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
