package codsoft.backend.dtos;

import jakarta.persistence.Column;

public class CardDTO {
	   private Long id;
	  
	    private String name;
	    
	    private String email;
	    
	    private String cardNumber;
	    
	    private String  monthExpir;
	    
	    private String  yearExpir;
	    
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
