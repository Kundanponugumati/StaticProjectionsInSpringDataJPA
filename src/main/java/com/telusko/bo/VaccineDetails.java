package com.telusko.bo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vaccine_info")
public class VaccineDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String vaccineName;
    String vaccineCompany;
    @Column(name = "vaccine_price")
    Integer price;

    public VaccineDetails() {
    }

    public VaccineDetails(String vaccineName, String vaccineCompany, Integer price) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.price = price;
    }
}
