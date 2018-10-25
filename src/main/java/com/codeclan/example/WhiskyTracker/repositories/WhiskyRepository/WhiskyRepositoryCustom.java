package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    List<Whisky> getAllWhiskeyPerYear(int year);

    List<Whisky> getAllWhiskeyPerRegion(String region);
}
