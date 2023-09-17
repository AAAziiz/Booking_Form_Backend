package codsoft.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="flights")
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private Long id;
	@Column
    private Boolean direct_flight;
	@Column
    private String flightType;
	@Column
    private String fromcity;
	@Column
    private String tocity;
	@Column
    private boolean addNearbyAirportsFrom;
	@Column
    private boolean addNearbyAirportsTo;
	@Column
    private String travelClass;
	@Column
    private String departureDate;
	@Column
    private String returnDate;
	@Column
    private Integer	adults;
	@Column
    private Integer children;
	
	
	public Boolean getDirect_flight() {
		return direct_flight;
	}
	public void setDirect_flight(Boolean direct_flight) {
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
