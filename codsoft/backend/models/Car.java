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
@Table(name="cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    private Long id;
	@Column
    private boolean location_return;
	@Column
    private String cartype;
	@Column
    private String awd;
	@Column
    private String carclass;
	@Column
    private String pick_date;
	@Column
    private String drop_date;
	@Column
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
