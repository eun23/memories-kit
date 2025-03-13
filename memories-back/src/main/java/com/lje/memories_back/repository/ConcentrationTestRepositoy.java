package com.lje.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lje.memories_back.common.entity.ConcentrationTestEntity;
import com.lje.memories_back.common.entity.pk.ConcentrationTestPk;

@Repository
public interface ConcentrationTestRepositoy extends JpaRepository<ConcentrationTestEntity, ConcentrationTestPk> {
  
}
