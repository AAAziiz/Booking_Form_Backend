package codsoft.backend.services;
import codsoft.backend.dtos.FlightDTO;
import codsoft.backend.models.Flight;

public interface FlightService {
	Flight createFlight(FlightDTO flightDTO);
	void updateDepartureDate(long id,String NewDepartureDate);
	void updateReturnDate(long id,String NewReturnDate);
	void Addchildren(long id,Integer Newchildren);
	void AddAdults(long id,Integer NewAdults);
}
