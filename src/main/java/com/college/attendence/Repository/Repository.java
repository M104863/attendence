package com.college.attendence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.attendence.Model.Entity;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Integer> {

}
