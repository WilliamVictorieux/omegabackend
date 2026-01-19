package com.omega.omegabackend.config;

import com.omega.omegabackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private AdminService adminService;

    @Override
    public void run(String... args) throws Exception {
        // Vérifie si l'admin existe déjà avant de créer
        if (adminService.login("admin@example.com", "123456") == null) {
            adminService.createAdmin("admin@example.com", "123456");
            System.out.println("Premier admin créé : admin@example.com / 123456");
        }
    }
}
