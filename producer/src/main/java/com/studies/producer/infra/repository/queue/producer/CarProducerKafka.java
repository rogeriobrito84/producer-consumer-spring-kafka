package com.studies.producer.infra.repository.queue.producer;

import com.studies.producer.domain.car.Car;
import com.studies.producer.domain.car.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CarProducerKafka implements CarRepository {

    private final KafkaTemplate<String, Car> kafkaTemplate;

    @Value("${topic.name}")
    private String topic;

    @Override
    public void create(Car car) {
        kafkaTemplate.send(topic, car).addCallback(
                success -> System.out.println(success.getProducerRecord().value()),
                failure -> System.out.println(failure.getMessage())
        );
    }
}