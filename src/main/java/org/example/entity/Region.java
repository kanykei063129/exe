package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "regions")
@Getter
@Setter
@NoArgsConstructor
public class Region{
    @Id
    @GeneratedValue(generator = "regions_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "regions_gen",sequenceName = "regions_seq", allocationSize = 1)
    private Long id;
    private String region_name;
    @ManyToOne
    private Bank bank;

    public Region(String region_name, Bank bank) {
        this.region_name = region_name;
        this.bank = bank;
    }
}
