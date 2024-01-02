package org.example;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor@NoArgsConstructor
@ToString
@Data
@Builder
@Component

public class Course2 {
    private int id;
    private String courseName;
    private int Price;
}
