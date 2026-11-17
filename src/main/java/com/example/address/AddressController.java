package com.example.address;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AddressController {

    @GetMapping("/address/{id}")
    public Map<String, Object> getAddress(@PathVariable int id) {

        if (id == 1) {
            return Map.of(
                "id", 1,
                "name", "Sai",
                "city", "Eluru",
                "state", "Andhra Pradesh"
            );
        }

        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Address not found"
        );
    }
}