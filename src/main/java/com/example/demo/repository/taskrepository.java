package com.example.demo.repository;

import com.example.demo.domain.Task;
import java.sql.Timestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;



public interface taskrepository extends JpaRepository<Task,Integer>{

	@Modifying       //KENDİ UPDATE SORGUMUZU OLUŞTURMAYI DENEDİK ÇALIŞMADI
	// Queryde entity başharfi büyük olmalı
	@Query("UPDATE Task c SET c.task_id = :task_id,c.title =:title,c.assignee =:assignee,c.notes=:notes,c.context=:context,c.update_date=:update_date  WHERE c.id = :id")
	void updateTaskById(@Param("task_id") String TASK_ID,@Param("title") String TITLE,@Param("context") String CONTEXT,@Param("assignee") String assignee,
			@Param("update_date")Timestamp UPDATE_DATE,@Param("notes") String NOTES,@Param("id") Integer ID);
}
