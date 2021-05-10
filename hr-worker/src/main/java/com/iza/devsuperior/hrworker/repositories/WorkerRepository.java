package com.iza.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iza.devsuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
