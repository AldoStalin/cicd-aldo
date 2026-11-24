package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	@GetMapping(value = "/{name}", produces = "application/json")
    public String getName(@PathVariable String name) {
        return "Hello Spring Aldo";
    }

}
