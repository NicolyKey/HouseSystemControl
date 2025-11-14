package com.producer.gate.usecases.getGates;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetGatesRequest {

    private Integer page;
    private Integer pageSize;
}
