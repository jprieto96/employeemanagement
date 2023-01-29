package net.myspace.core.department.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public final class Department {

    @Id
    private UUID id;
    private String name;

}
