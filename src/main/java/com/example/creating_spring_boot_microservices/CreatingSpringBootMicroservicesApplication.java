package com.example.creating_spring_boot_microservices;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.creating_spring_boot_microservices.tourservice.TourManagementService;
import com.example.creating_spring_boot_microservices.tourservice.TravelAgentService;

@SpringBootApplication
public class CreatingSpringBootMicroservicesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CreatingSpringBootMicroservicesApplication.class.getPackageName())) {
			TravelAgentService agent = context.getBean(TravelAgentService.class);
			TourManagementService manager = context.getBean(TourManagementService.class);

			System.out.println("=================== ALL TOURS ===================\n");
			agent.displayTours();

			System.out.println("\n=================== KID FRIENDLY TOURS ===================\n");
			agent.displayToursBy(true);

			manager.createTour("Tropical Paradise", 1000, false);
			
			System.out.println("\n=================== NEW TROPICAL PARADISE TOUR ===================\n");
			agent.displayTours();
		}
	}

}
