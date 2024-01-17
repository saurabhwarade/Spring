package org.example.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_id")
    private int id;
    @Column(name = "Student_Name")
    private String name;
    @Column(name = "Mobile_Number")
    private String mobile;
    @Column(name = "DOB")
    private String Dob;
    @Column(name = "Address")
    private String address;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;


}
