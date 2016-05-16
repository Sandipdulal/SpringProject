package com.apub.dorm.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.apub.dorm.domain.MaintenanceStatus;
import com.apub.dorm.domain.Student;
import com.apub.dorm.domain.Maintenance;
import com.apub.dorm.repository.MaintenanceRepository;
import com.apub.dorm.service.MaintenanceService;

@Component
@Transactional
public class MaintenanceServiceImpl implements MaintenanceService{
	
	@Autowired
	private MaintenanceRepository maintenanceRepository;

	

	@Override
	public List<Maintenance> findAll() {
		System.out.println(maintenanceRepository.findAll());
		return maintenanceRepository.findAll();
	}

	@Override
	public void create(Maintenance maintenance) {
		if(maintenance.getStatus() == null) maintenance.setStatus(MaintenanceStatus.NEW);
			maintenanceRepository.save(maintenance);
		
	}

	@Override
	public Maintenance findOne(Integer id) {
		return maintenanceRepository.findOne(id);
	}

	@Override
	public void update(Maintenance maintenance, int id) {
		maintenance.setId(id);
		 maintenanceRepository.save(maintenance);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}