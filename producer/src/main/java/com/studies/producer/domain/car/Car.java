package com.studies.producer.domain.car;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    private String id;
    private String model;
    private String color;
}