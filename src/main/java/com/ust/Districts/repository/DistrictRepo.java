package com.ust.Districts.repository;

import com.ust.Districts.model.DistrictModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistrictRepo extends JpaRepository<DistrictModel,Integer> {
List<DistrictModel> findByStateName(String stateName);
}
