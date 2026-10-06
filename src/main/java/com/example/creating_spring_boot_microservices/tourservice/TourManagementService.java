package com.example.creating_spring_boot_microservices.tourservice;

import org.springframework.stereotype.Service;

import com.example.creating_spring_boot_microservices.tourservice.utilities.TourRepository;

@Service 
public class TourManagementService {
    private TourRepository tourRepository;

    public TourManagementService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;

        createTour("Big Sur Retreat", 750, true);
        createTour("Yellowstone", 1000, true);
    }

    public void createTour(String title, Integer price, Boolean kidFriendly) {
        tourRepository.save(new Tour(title, price, kidFriendly));
    }
}
