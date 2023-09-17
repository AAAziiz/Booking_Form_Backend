package codsoft.backend.dtos;


public class FlightDTO {
	    private Long id;
	    private boolean direct_flight;
	    private String flightType;
	    private String fromcity;
	    private String tocity;
	    private boolean addNearbyAirportsFrom;
	    private boolean addNearbyAirportsTo;
	    private String travelClass;
	    private String departureDate;
	    private String returnDate;
	    private Integer	adults;
	    private Integer children;
	    
	
		public boolean isDirect_flight() {
			return direct_flight;
		}
		public void setDirect_flight(boolean direct_flight) {
			this.direct_flight = direct_flight;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getFlightType() {
			return flightType;
		}
		public void setFlightType(String flightType) {
			this.flightType = flightType;
		}
		
		public String getFromcity() {
			return fromcity;
		}
		public void setFromcity(String fromcity) {
			this.fromcity = fromcity;
		}
		public String getTocity() {
			return tocity;
		}
		public void setTocity(String tocity) {
			this.tocity = tocity;
		}
		public boolean isAddNearbyAirportsFrom() {
			return addNearbyAirportsFrom;
		}
		public void setAddNearbyAirportsFrom(boolean addNearbyAirportsFrom) {
			this.addNearbyAirportsFrom = addNearbyAirportsFrom;
		}
		public boolean isAddNearbyAirportsTo() {
			return addNearbyAirportsTo;
		}
		public void setAddNearbyAirportsTo(boolean addNearbyAirportsTo) {
			this.addNearbyAirportsTo = addNearbyAirportsTo;
		}
		public String getTravelClass() {
			return travelClass;
		}
		public void setTravelClass(String travelClass) {
			this.travelClass = travelClass;
		}
		public String getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		public String getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(String returnDate) {
			this.returnDate = returnDate;
		}
		public Integer getAdults() {
			return adults;
		}
		public void setAdults(Integer adults) {
			this.adults = adults;
		}
		public Integer getChildren() {
			return children;
		}
		public void setChildren(Integer children) {
			this.children = children;
		}
		
}
