package com.fortune;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface AppointmentRepository extends MongoRepository<Appointment, Integer>{

}