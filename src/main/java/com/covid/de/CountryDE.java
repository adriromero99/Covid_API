package com.covid.de;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COUNTRIES")
public class CountryDE {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "CASES")
    Long cases;

    @Column(name = "DEATHS")
    Long deaths;

    @Column(name = "DATE")
    LocalDateTime date;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    Set<StateDE> states;

}
