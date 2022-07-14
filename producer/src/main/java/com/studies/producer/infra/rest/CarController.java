package com.studies.producer.infra.rest;

import com.studies.producer.domain.car.Car;
import com.studies.producer.domain.car.CreateCarUC;
import com.studies.producer.infra.rest.dto.CarDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Tag(name = CarController.nameTag, description = "Api of manager cars")
@RestController
@RequestMapping("/cars")
public class CarController {

    public static final String nameTag = "Cars";

    private final CreateCarUC createCarUC;

    @Operation(tags = CarController.nameTag, description = "EndPoint for create car")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(CarDTO dto) {
        var car = Car.builder()
                .color(dto.getColor())
                .model(dto.getModel())
                .build();
        createCarUC.execute(car);
    }

}
