package com.producer.gate.usecases.createTask;

import com.producer.gate.enums.CommandType;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskRequest {

    private UUID gateId;
    private UUID roomId;
    private CommandType action;
}
