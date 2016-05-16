package com.apub.dorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apub.dorm.domain.Feedback;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.domain.Student;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer>{

	
}