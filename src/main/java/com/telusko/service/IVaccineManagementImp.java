package com.telusko.service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class IVaccineManagementImp implements IVaccineManagement{

    @Autowired
    private IVaccineRepository repository;

    @Override
    public List<VaccineDetails> searchByVaccineCompany(String vaccineCompany) {
        System.out.println("Finder method is implemented by: "+repository.getClass().getName());
        return repository.findByVaccineCompany(vaccineCompany);
    }

    @Override
    public List<VaccineDetails> searchByPrice(Integer price) {
       return repository.findByPrice(price);
    }

    @Override
    public List<VaccineDetails> searchByVaccineName(String vaccineName) {
        return repository.findByVaccineName(vaccineName);
    }

    @Override
    public List<VaccineDetails> searchByPriceLessThanEqual(Integer price) {
        return repository.findByPriceLessThanEqual(price);
    }

    @Override
    public List<VaccineDetails> searchByVaccineNameInAAndPriceBetween(Collection<String> vaccineNames, Integer startingPrice, Integer endingPrice) {
        return repository.findByVaccineNameInAndPriceBetween(vaccineNames, startingPrice, endingPrice);
    }
}
