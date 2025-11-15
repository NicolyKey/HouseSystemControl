package com.producer.air_conditioning.repositories;

import com.producer.air_conditioning.entities.AirConditioningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirContioningRepository extends JpaRepository<Long, AirConditioningEntity> {
}
