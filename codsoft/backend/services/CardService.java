package codsoft.backend.services;

import codsoft.backend.dtos.CardDTO;
import codsoft.backend.models.Card;

public interface CardService {
	
	Card createCard(CardDTO card );

}
