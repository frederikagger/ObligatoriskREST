package home.repository;

import home.model.Wind;
import org.springframework.data.repository.CrudRepository;

public interface WindRepository extends CrudRepository<Wind, Long> {
}
