package com.joy.gifsample.repository;

import com.joy.gifsample.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Shipwreck, Long> {
}
