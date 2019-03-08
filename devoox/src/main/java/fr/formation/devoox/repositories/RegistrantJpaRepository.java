package fr.formation.devoox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.devoox.entities.Registrant;

public interface RegistrantJpaRepository extends JpaRepository<Registrant, Long>{
}
