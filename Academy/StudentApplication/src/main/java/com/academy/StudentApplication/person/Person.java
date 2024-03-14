package com.academy.StudentApplication.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @NotNull
    private long pid;

    @NotNull
    @NotBlank
    @Column(name = "first_name")
    private String firstName;


    @Column(name = "middle_name")
    private String middleName;

    @NotNull
    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String phone;
}
