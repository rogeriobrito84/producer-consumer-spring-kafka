package com.studies.producer.domain.car;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class CreateCarUC {
    private final CarRepository repository;

    public void execute(Car car) {
        car.setId(UUID.randomUUID().toString());
        repository.create(car);
    }
}
