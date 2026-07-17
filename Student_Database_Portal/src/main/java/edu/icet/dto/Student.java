package edu.icet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity    // Entity means a database table, if there is an Entity then there should be a primary key
@Table(name = "student")
public class Student {
    @Id     // Telling this is the primary key
    private Integer id;
    private String name;
    private String address;
}
