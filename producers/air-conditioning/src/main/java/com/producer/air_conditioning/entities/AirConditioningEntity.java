package com.producer.air_conditioning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "air_conditioning", schema = "public")
public class AirConditioningEntity {
    @Id
    @Generated
    private Long id;

}
