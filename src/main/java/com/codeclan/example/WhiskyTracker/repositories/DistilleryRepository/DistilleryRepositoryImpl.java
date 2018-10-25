package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    //TODO: Get all distilleries from a particular region

    //TODO: Get distilleries that have whiskeys over 12years
}
