package com.omega.omegabackend.service;

import com.omega.omegabackend.model.Admin;
import com.omega.omegabackend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // <-- injection du PasswordEncoder

    // Méthode existante pour login
    public Admin login(String email, String password) {
        Optional<Admin> adminOpt = adminRepository.findByEmail(email);
        
        if (adminOpt.isPresent()) {
            Admin admin = adminOpt.get();
            // Vérification avec BCrypt
            if (passwordEncoder.matches(password, admin.getPassword())) {
                return admin;
            }
        }
        return null;
    }

    // NOUVELLE MÉTHODE pour créer un admin avec mot de passe crypté
    public Admin createAdmin(String email, String rawPassword) {
        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setPassword(passwordEncoder.encode(rawPassword)); // mot de passe crypté
        return adminRepository.save(admin);
    }
}
