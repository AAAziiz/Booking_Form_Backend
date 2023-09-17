package codsoft.backend.services;

import codsoft.backend.dtos.FlightDTO;
import codsoft.backend.models.Flight;

public interface FlightService {
	Flight createFlight(FlightDTO flightDTO);

}
