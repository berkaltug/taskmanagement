package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface userrepository extends JpaRepository<User,Integer>{

	
	@Modifying
	@Query("UPDATE User u SET u.isim=:isim WHERE u.id=:id") // entity baş harfi büyük olmalı !
	void updateUserById(@Param("id")Integer ID,@Param("isim")String ISIM);
}
