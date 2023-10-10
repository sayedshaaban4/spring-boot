package com.sayed.springBoot.demo.repository;

import com.sayed.springBoot.demo.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface departmentRepository extends JpaRepository<department,Long> {
}
