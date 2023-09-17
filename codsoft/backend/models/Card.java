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
@Table(name="cards")
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String cardNumber;
    @Column
    private String  monthExpir;
    @Column
    private String  yearExpir;
    @Column
    private String  cardCvc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getMonthExpir() {
		return monthExpir;
	}
	public void setMonthExpir(String monthExpir) {
		this.monthExpir = monthExpir;
	}
	public String getYearExpir() {
		return yearExpir;
	}
	public void setYearExpir(String yearExpir) {
		this.yearExpir = yearExpir;
	}
	public String getCardCvc() {
		return cardCvc;
	}
	public void setCardCvc(String cardCvc) {
		this.cardCvc = cardCvc;
	}
    
    

    

}
