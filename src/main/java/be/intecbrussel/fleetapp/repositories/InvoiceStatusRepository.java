package be.intecbrussel.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.intecbrussel.fleetapp.models.InvoiceStatus;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
