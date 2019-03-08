package fr.formation.devoox.services;

import javax.validation.Valid;

import fr.formation.devoox.dtos.RegistrantCreateDto;

public interface RegistrantService {

    void create(RegistrantCreateDto registrant);
}
