package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CustomTable2;
import com.example.demo.entity.CustomTable2PK;


public interface CustomTableRepository extends CrudRepository<CustomTable2, CustomTable2PK> {

    List<CustomTable2> findByDataString(String dataString);
}

