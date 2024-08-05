package guavas.cashcard.repositories;

import guavas.cashcard.CashCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}