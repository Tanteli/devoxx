package fr.formation.devoox.controllers;

import javax.validation.Valid;
import javax.xml.ws.RequestWrapper;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.devoox.dtos.RegistrantCreateDto;
import fr.formation.devoox.services.RegistrantService;


@RestController
@RequestMapping("/registrants")
public class RegistrantController {
    
    private final RegistrantService service;
    
    public RegistrantController(RegistrantService service) {
	this.service = service;
    }
    
    @PostMapping
    protected void create(@Valid @RequestBody RegistrantCreateDto registrant) {
	
	service.create(registrant);
    }
    
   
    
}
