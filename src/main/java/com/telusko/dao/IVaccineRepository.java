package com.telusko.dao;

import com.telusko.bo.VaccineDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<VaccineDetails,Long> {
    List<VaccineDetails> findByVaccineCompany(String vaccineCompany); // findByProperty
    List<VaccineDetails> findByPrice(Integer price);
    List<VaccineDetails> findByVaccineName(String vaccineName);
    List<VaccineDetails> findByPriceLessThanEqual(Integer price);

    // in operator we use for multiple data.
    List<VaccineDetails> findByVaccineNameInAndPriceBetween(Collection<String> vaccineNames ,Integer startingPrice,Integer endingPrice); // findByPropertyKeyWordPropertyKeyWord
}
