package fr.formation.devoox.dtos;

import javax.validation.constraints.NotBlank;

public class RegistrantDto {
    
    @NotBlank
    private String firstname;
    
    @NotBlank
    private String lastname;
    
    @NotBlank
    private int daysnumber;
    
    public RegistrantDto() {
	
    }

    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    public int getDaysnumber() {
        return daysnumber;
    }

    
    public void setDaysnumber(int daysnumber) {
        this.daysnumber = daysnumber;
    }
    
    
    
    
}
