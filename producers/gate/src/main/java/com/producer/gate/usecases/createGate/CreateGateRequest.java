package com.producer.gate.usecases.createGate;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateGateRequest {
    private UUID roomId;
}
