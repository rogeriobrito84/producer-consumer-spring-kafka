package com.studies.consumer.infra.repository.queue.consumer;

import com.studies.consumer.domain.car.Car;
import com.studies.consumer.domain.car.LoadCarUC;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CarConsumerKafka {

    private final LoadCarUC loadCarUC;

    @KafkaListener(
            topics = "${topic.name}",
            groupId = "${spring.kafka.group-id}",
            containerFactory = "kafkaJsonListenerContainerFactory"
    )
    public void listenTopiCar(ConsumerRecord<String, Car> record) {
        loadCarUC.execute(record.value());
    }

}
