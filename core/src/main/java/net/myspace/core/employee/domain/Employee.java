package net.myspace.core.employee.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public final class Employee {

    @Id
    private UUID id;
    private String name;
    private String surname;

}
