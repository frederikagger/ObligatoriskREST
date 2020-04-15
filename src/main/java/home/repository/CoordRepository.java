package home.repository;

import home.model.Coord;
import org.springframework.data.repository.CrudRepository;

public interface CoordRepository extends CrudRepository<Coord, Long> {
}
