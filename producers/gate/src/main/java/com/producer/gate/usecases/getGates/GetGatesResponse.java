package com.producer.gate.usecases.getGates;

import com.producer.gate.entities.Gate;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetGatesResponse {
    List<Gate> gates;
    Integer totalPages;
}
