package codsoft.backend.services;

import codsoft.backend.dtos.CarDTO;
import codsoft.backend.models.Car;

public interface CarService {
	Car createCar(CarDTO carDTO);


}
