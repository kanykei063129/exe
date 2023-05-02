package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
    @Table(name = "banks")
    @Getter
    @Setter
    @NoArgsConstructor
    public class Bank {
        @Id
        @GeneratedValue(generator = "banks_gen",strategy = GenerationType.SEQUENCE)
        @SequenceGenerator(name = "banks_gen",sequenceName = "banks_seq",
                allocationSize = 1)
        private Long id;
        private String name;
        private String address;
        @ManyToMany
        private List<Client>client;
        @ManyToOne
        private  Region region;

    public Bank(String name, String address, List<Client> client) {
        this.name = name;
        this.address = address;
        this.client = client;
    }

    public Bank(String name, String address, List<Client> client, Region region) {
        this.name = name;
        this.address = address;
        this.client = client;
        this.region = region;
    }
}
