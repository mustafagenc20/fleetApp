package be.intecbrussel.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import be.intecbrussel.fleetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
