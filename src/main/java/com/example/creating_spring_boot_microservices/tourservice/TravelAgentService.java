package com.example.creating_spring_boot_microservices.tourservice;

import org.springframework.stereotype.Service;

import com.example.creating_spring_boot_microservices.tourservice.utilities.TourRepository;

@Service 
public class TravelAgentService {
    private TourRepository tourRepository;

    public TravelAgentService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public void displayTours() {
        tourRepository.findAll().stream().forEach(System.out::println);
    }

    public void displayToursBy(Boolean isKidFriendly) {
        tourRepository.findByType(isKidFriendly).stream().forEach(System.out::println);
    }
  
}
