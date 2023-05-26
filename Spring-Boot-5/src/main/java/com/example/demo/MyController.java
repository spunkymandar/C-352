package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    private final ICountryService countryService;

    public MyController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ModelAndView getCountries() {

        List<Country> countries = countryService.findAll();

        Map<String,Object> params = new HashMap<String, Object>();
        params.put("countries", countries);

        return new ModelAndView("showCountries", params);
    }
}
