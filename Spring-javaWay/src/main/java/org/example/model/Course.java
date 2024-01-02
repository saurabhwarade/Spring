package org.example.model;

import lombok.*;

@AllArgsConstructor@NoArgsConstructor
@ToString
@Data
@Builder

public class Course {
    private int id;
    private String courseName;
    private int Price;
}
