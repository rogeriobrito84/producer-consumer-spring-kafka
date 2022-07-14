package com.studies.consumer.domain.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoadCarUC {
    public void execute(Car car) {
        log.info("**************");
        log.info("Id: {}", car.getId());
        log.info("Color: {}", car.getColor());
        log.info("Model: {}", car.getModel());
    }
}
