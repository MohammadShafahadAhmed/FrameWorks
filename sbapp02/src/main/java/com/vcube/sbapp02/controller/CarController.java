package com.vcube.sbapp02.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp02.model.Car;

@RestController
public class CarController {

	// REST End-point : http://localhost:1917/getCarInfo
	@GetMapping("/getCarInfo")
	Car getCarInfo() {
		Car c = new Car("Toyota", "Glanza", 1100000.00, "White");
		return c;
	}

	@GetMapping("/getAllCars")
	List<Car> getAllCars() {
		List<Car> list = new ArrayList<>();
		Car c1 = new Car("Toyota", "Glanza", 1100000.00, "White");
		Car c2 = new Car("Hyndai", "creta", 1500000.00, "White");
		Car c3 = new Car("Tata", "Nexon", 1000000.00, "White");
		Car c4 = new Car("Mahindra", "Thar", 1600000.00, "White");
		Car c5 = new Car("Suzuki", "Dzire", 1100000.00, "White");

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);

		return list;

	}

}
