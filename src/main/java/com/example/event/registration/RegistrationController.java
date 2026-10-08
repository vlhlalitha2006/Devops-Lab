package com.example.event.registration;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final List<Registration> registrations = new ArrayList<>();

    @PostMapping
    public String register(@RequestBody Registration registration) {

        registrations.add(registration);

        return "Registration successful for " + registration.getName();
    }

    @GetMapping
    public List<Registration> getRegistrations() {

        return registrations;
    }
}