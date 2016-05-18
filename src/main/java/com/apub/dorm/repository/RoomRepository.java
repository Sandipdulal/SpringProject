package com.apub.dorm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apub.dorm.domain.Building;
import com.apub.dorm.domain.Item;
import com.apub.dorm.domain.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Serializable> {
	
	Room findById(Integer id);

//	List<Room> findRoomByBuildingId(int buildingNo);
	
//	public List<Building> findRoomNumbersByBuildingNo(int buildingNumber);
//	public List<Room> findByStudent(Student student);

}
