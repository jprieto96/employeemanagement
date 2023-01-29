package net.myspace.backoffice.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public final class EmployeeController {

    @PostMapping("/create")
    private ResponseEntity create(@RequestBody Request request) {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    final class Request {
        private String name;
        private String surname;
    }

}
