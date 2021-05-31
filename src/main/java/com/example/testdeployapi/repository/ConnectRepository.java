package com.example.testdeployapi.repository;

import com.example.testdeployapi.entity.Connect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectRepository extends JpaRepository<Connect,Integer> {
    public Connect findAllByStatusName(String name);
}
