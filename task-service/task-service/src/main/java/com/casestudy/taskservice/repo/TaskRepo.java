package com.casestudy.taskservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.taskservice.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
