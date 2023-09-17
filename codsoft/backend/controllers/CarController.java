			package codsoft.backend.controllers;
			
			import java.util.List;
			
			import org.springframework.beans.factory.annotation.Autowired;
			import org.springframework.http.HttpStatus;
			import org.springframework.http.ResponseEntity;
			import org.springframework.web.bind.annotation.CrossOrigin;
			import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
			import org.springframework.web.bind.annotation.RequestBody;
			import org.springframework.web.bind.annotation.RequestMapping;
			import org.springframework.web.bind.annotation.RestController;

import codsoft.backend.ResourceNotFoundException;
import codsoft.backend.dtos.CarDTO;
			import codsoft.backend.dtos.CarFilter;
			import codsoft.backend.dtos.FlightFilter;
			import codsoft.backend.models.Car;
			import codsoft.backend.models.Flight;
			import codsoft.backend.repositories.CarRepository;
			import codsoft.backend.services.CarService;
			
			@RestController
			@CrossOrigin(origins = "http://localhost:4200")
			@RequestMapping("/api2")
			public class CarController {
				@Autowired
				private CarService carService;
				@Autowired
				private CarRepository repo;
				@PostMapping("/registercar")
			    public ResponseEntity<?> addFlight(@RequestBody CarDTO car) {
			       Car createdCar = carService.createCar(car);
			       if (createdCar == null){
			           return new ResponseEntity<>("Car not created, come again later!", HttpStatus.BAD_REQUEST);
			       }
			       return new ResponseEntity<>(createdCar, HttpStatus.CREATED);}
			
			@GetMapping("/getallcars")
				public ResponseEntity<List<Car>> getAllCars(){
					return ResponseEntity.ok(repo.findAll());
				}
			
			
			@PostMapping("/filtercars")
			public ResponseEntity<List<Car>> filterCars(@RequestBody CarFilter filterRequest) {
			    String cartype = filterRequest.getType();
			    
			    List<Car> filteredCars = repo.findByCartype(cartype);
			    System.out.println("Filtered cars count: " + filteredCars.size());
			
			    return ResponseEntity.ok(filteredCars);
			}
			 @GetMapping("/cars/{id}")
			 public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carid)
			            throws codsoft.backend.ResourceNotFoundException {
		    Car car=repo.findById(carid)
		    		.orElseThrow(() -> new ResourceNotFoundException("Car not found for this id :: " + carid));
		    return ResponseEntity.ok().body(car);}
			 
			
				
			
			}
