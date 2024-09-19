package com.testsigma.Database.Comparition.repository;


import com.testsigma.Database.Comparition.model.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {
}