package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Country> findAll() {

        return (List<Country>) repository.findAll();
    }
}