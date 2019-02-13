package com.joy.gifsample.repository;


import com.joy.gifsample.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
