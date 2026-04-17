package ek.osnb.bff.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    public record AdminMessage(String message) {
    }

    @GetMapping
    AdminMessage getAdmin() {
        return new AdminMessage("Hello Admin!");
    }
}
