package com.producer.air_conditioning.usecases.createAirConditioning;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CreateAirConditioningRequest {
    private Long areaId;
}
