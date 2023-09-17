package codsoft.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codsoft.backend.dtos.FlightDTO;
import codsoft.backend.models.Flight;
import codsoft.backend.repositories.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository repo;
	

	 @Override
	public Flight createFlight(FlightDTO flightDTO) {
			Flight flight =new Flight();
			flight.setId(flightDTO.getId());
			flight.setDirect_flight(flightDTO.isDirect_flight());
			flight.setFlightType(flightDTO.getFlightType());
			flight.setFromcity(flightDTO.getFromcity());
			flight.setTocity(flightDTO.getTocity());
			flight.setAddNearbyAirportsFrom(flightDTO.isAddNearbyAirportsFrom());
			flight.setAddNearbyAirportsTo(flightDTO.isAddNearbyAirportsTo());
			flight.setTravelClass(flightDTO.getTravelClass());
			flight.setDepartureDate(flightDTO.getDepartureDate());
			flight.setReturnDate(flightDTO.getReturnDate());
			flight.setAdults(flightDTO.getAdults());
			flight.setChildren(flightDTO.getChildren());
			return repo.save(flight);
			
					
		
	}
	
	
	
	

}

