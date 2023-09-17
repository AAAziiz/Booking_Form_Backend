package codsoft.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codsoft.backend.dtos.CarDTO;
import codsoft.backend.models.Car;
import codsoft.backend.repositories.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository repo;

	@Override
	public Car createCar(CarDTO carDTO) {
			Car car=new Car();
			car.setId(carDTO.getId());
			car.setLocation_return(carDTO.isLocation_return());
			car.setCartype(carDTO.getCartype());
			car.setAwd(carDTO.getAwd());
			car.setCarclass(carDTO.getCarclass());
			car.setPick_date(carDTO.getPick_date());
			car.setDrop_date(carDTO.getDrop_date());
			car.setPassengers(carDTO.getPassengers());
			return repo.save(car);
		
	}

}
