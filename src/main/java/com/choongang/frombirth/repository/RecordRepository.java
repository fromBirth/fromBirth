package com.choongang.frombirth.repository;
import com.choongang.frombirth.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Integer> {
}
