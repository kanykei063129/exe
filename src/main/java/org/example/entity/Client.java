package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
    @Table(name = "clients")
    @Getter
    @Setter
    @NoArgsConstructor
    public class Client{
        @Id
        @GeneratedValue(generator = "clients_gen",strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name = "clients_gen",sequenceName = "clients_seq",
                allocationSize = 1)
        private Long id;
        @Column(name = "full_name")
        private String fullName;
        private String country;
        @ManyToMany
        private List<Bank>bank;
        @OneToOne
        private Passport passport;

    public Client(String fullName, String country, List<Bank> bank) {
        this.fullName = fullName;
        this.country = country;
        this.bank = bank;
    }

    public Client(String fullName, String country, List<Bank> bank, Passport passport) {
        this.fullName = fullName;
        this.country = country;
        this.bank = bank;
        this.passport = passport;
    }
}
