package io.cellulant.gbp.service;

import io.cellulant.gbp.entity.AppUser;
import io.cellulant.gbp.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public void saveUser(AppUser appUser) {
        // Validate email format
        if (!validateEmail(appUser.getEmail())) {
             new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        // Save to database
        appUserRepository.save(appUser);
    }

    private boolean validateEmail(String email) {
        // Add email validation logic here
        // Example: check if the email contains an "@" symbol and a "."
        return email.contains("@") && email.contains(".");
    }

}
