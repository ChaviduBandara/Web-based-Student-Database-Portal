package edu.icet.dto;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)     // auto generating the primary key
    private Integer id;
    private String name;
    private String address;
}
