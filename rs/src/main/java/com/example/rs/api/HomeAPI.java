package com.example.rs.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('SCOPE_test')")
    public String home() {
        return "Protected Resource!";
    }
}
