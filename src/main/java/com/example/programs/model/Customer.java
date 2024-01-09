package com.example.programs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="/customer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="email")
    private String email;

}
