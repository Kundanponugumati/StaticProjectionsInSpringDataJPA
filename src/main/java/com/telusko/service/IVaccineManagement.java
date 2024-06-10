package com.telusko.service;

import com.telusko.bo.VaccineDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface IVaccineManagement {
    List<VaccineDetails> searchByVaccineCompany(String vaccineCompany);
    List<VaccineDetails> searchByPrice(Integer price);
    List<VaccineDetails> searchByVaccineName(String vaccineName);
    List<VaccineDetails> searchByPriceLessThanEqual(Integer price);
    List<VaccineDetails> searchByVaccineNameInAAndPriceBetween(Collection<String> vaccineNames , Integer startingPrice, Integer endingPrice);

}
