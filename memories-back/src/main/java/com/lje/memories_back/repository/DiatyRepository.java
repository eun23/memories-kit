package com.lje.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lje.memories_back.common.entity.DiaryEntity;

@Repository
public interface DiatyRepository extends JpaRepository<DiaryEntity, Integer> {
  
}
