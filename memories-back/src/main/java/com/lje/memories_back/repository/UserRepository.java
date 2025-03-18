package com.lje.memories_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lje.memories_back.common.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  
  boolean existsByUserId(String userId);

  UserEntity findByUserId(String userId);
  UserEntity findByJoinTypeAndSnsId(String joinType, String snsId);

}
