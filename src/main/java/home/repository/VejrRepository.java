package home.repository;

import home.model.Vejr;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface VejrRepository extends CrudRepository<Vejr, Long> {

}