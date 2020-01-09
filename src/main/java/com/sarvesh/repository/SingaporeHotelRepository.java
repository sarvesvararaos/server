package com.sarvesh.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sarvesh.model.SingaporeHotel;

@Repository
public interface SingaporeHotelRepository extends JpaRepository<SingaporeHotel	, Integer> {

	Iterator<SingaporeHotel> save(Iterator<SingaporeHotel> obj);
	
	 List<SingaporeHotel> findByName(String name);

	 @Query(value="select * from singapore_hotel order by price",nativeQuery = true)
	 List<SingaporeHotel> findSortedAll();
}
