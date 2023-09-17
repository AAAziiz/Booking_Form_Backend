package codsoft.backend.dtos;

import jakarta.persistence.Column;

public class HotelDTO {
		private Long id;
	    private String hotel_Type;
	    private String destination;
	    private int rooms;
	    private int star_rating;
	    private String arrival_date;
	    private String leave_date;
	    private int adults;
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
