package com.choongang.frombirth.repository;

import com.choongang.frombirth.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
