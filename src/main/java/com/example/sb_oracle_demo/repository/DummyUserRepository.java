package com.example.sb_oracle_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sb_oracle_demo.model.DummyUser;



@Repository
public interface DummyUserRepository extends JpaRepository<DummyUser, Long> {

}
