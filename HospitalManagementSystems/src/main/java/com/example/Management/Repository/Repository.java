package com.example.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Management.Entity.Entity;

public interface Repository extends JpaRepository<Entity, Long>{

}