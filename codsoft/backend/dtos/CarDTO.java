package codsoft.backend.dtos;

import jakarta.persistence.Column;

public class CarDTO {
		private Long id;
		
	    private boolean location_return;
	    private String cartype;
	    private String awd;
	    private String carclass;
	    private String pick_date;
	    private String drop_date;
	    private String passengers;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public boolean isLocation_return() {
			return location_return;
		}
		public void setLocation_return(boolean location_return) {
			this.location_return = location_return;
		}
		public String getCartype() {
			return cartype;
		}
		public void setCartype(String cartype) {
			this.cartype = cartype;
		}
		public String getAwd() {
			return awd;
		}
		public void setAwd(String awd) {
			this.awd = awd;
		}
		public String getCarclass() {
			return carclass;
		}
		public void setCarclass(String carclass) {
			this.carclass = carclass;
		}
		public String getPick_date() {
			return pick_date;
		}
		public void setPick_date(String pick_date) {
			this.pick_date = pick_date;
		}
		public String getDrop_date() {
			return drop_date;
		}
		public void setDrop_date(String drop_date) {
			this.drop_date = drop_date;
		}
		public String getPassengers() {
			return passengers;
		}
		public void setPassengers(String passengers) {
			this.passengers = passengers;
		}
	    
	    
	   

}
