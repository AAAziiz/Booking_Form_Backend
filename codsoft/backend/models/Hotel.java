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
@Table(name="hotels")
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private Long id;
	@Column
    private String hotel_Type;
	@Column
    private String destination;
	@Column
    private int rooms;
	@Column
    private int star_rating;
	@Column
    private String arrival_date;
	@Column
    private String leave_date;
	@Column
    private int adults;
	@Column
    private int children;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotel_Type() {
		return hotel_Type;
	}
	public void setHotel_Type(String hotel_Type) {
		this.hotel_Type = hotel_Type;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getStar_rating() {
		return star_rating;
	}
	public void setStar_rating(int star_rating) {
		this.star_rating = star_rating;
	}
	
	public String getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}
	public String getLeave_date() {
		return leave_date;
	}
	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}


}
