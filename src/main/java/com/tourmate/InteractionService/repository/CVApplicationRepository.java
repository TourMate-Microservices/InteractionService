package com.tourmate.InteractionService.repository;

import com.tourmate.InteractionService.entity.CVApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVApplicationRepository extends JpaRepository<CVApplication, Integer> {
}
