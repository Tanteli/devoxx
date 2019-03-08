package fr.formation.devoox.services;

import org.springframework.stereotype.Service;

import fr.formation.devoox.dtos.RegistrantCreateDto;
import fr.formation.devoox.entities.Registrant;
import fr.formation.devoox.repositories.RegistrantJpaRepository;

@Service
public class RegistrantServiceImpl implements RegistrantService {

   private final RegistrantJpaRepository repo;
   
   public RegistrantServiceImpl(RegistrantJpaRepository repo) {
       this.repo = repo;
   }

    @Override
    public void create(RegistrantCreateDto dto) {
	
	Registrant registrant = new Registrant();
	registrant.setFirstname(dto.getFirstname());
	registrant.setLastname(dto.getLastname());
	registrant.setDaysnumber(dto.getDaysnumber());
	repo.save(registrant);
    }
}
