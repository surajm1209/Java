package com.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
