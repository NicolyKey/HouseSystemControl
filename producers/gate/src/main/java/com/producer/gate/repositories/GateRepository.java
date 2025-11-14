package com.producer.gate.repositories;

import com.producer.gate.entities.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GateRepository extends JpaRepository<Gate, UUID>, JpaSpecificationExecutor<Gate> {
}
