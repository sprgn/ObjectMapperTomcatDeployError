package com.temp.repository;

import com.temp.model.TempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<TempEntity,Integer> {
}
