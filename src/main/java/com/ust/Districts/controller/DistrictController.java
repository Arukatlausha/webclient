package com.ust.Districts.controller;

import com.ust.Districts.model.DistrictModel;
import com.ust.Districts.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/districts")
public class DistrictController {
    @Autowired
    private DistrictRepo repo;
    @PostMapping("/add")
    public DistrictModel addDistrict(@RequestBody DistrictModel district) {
        return repo.save(district);
    }
    @GetMapping("/dist")
    public List<DistrictModel> getDistricts() {
        return repo.findAll();
    }
    @GetMapping("/dist/{stateName}")
    public List<DistrictModel> getDistrictByState(@PathVariable String stateName) {
        return repo.findByStateName(stateName);
    }
}
