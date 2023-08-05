package com.intership.microservisehabittracker.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usr",uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Email
    @NotNull
    private String email;

    @JsonIgnore
    private Boolean emailVerified;

    @JsonIgnore
    private String password;

    private String icon;

    private String locale;

    private int point;

    @JsonIgnore
    private String providerId;

    @JsonIgnore
    private String activationCode;

    @JsonIgnore
    private Boolean changablePassword;
}
