package com.example.dockerFirst.repository;

import com.example.dockerFirst.repository.entity.Info;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<Info, Long> {
}
