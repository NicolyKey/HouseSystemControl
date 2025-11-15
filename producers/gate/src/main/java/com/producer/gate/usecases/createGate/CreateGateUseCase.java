package com.producer.gate.usecases.createGate;

import com.producer.gate.entities.Gate;
import com.producer.gate.entities.Room;
import com.producer.gate.repositories.GateRepository;
import com.producer.gate.repositories.RoomRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateGateUseCase {

    private final RoomRepository roomRepository;
    private final GateRepository gateRepository;

    public void execute(CreateGateRequest command) {
        Room room = roomRepository.findById(command.getRoomId()).orElseThrow();
        Gate gate = Gate.create(room);
        gateRepository.save(gate);
    }

}
