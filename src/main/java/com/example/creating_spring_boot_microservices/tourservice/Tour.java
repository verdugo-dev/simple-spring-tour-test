package com.example.creating_spring_boot_microservices.tourservice;

public record Tour(String title, Integer price, Boolean kidFriendly) {
    @Override
    public String toString() {
        return String.format("%s : %d (kid friendly: %b)", title, price, kidFriendly ? "Yes" : "No");
    }
}
