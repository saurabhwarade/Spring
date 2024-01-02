package org.example.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor@NoArgsConstructor
@ToString
@Data
@Builder
@Component
public class Course {
    private int id;
    private String courseName;
    private int Price;
}
