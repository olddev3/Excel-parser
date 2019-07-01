package com.example.excel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.excel.model.Users;


@Repository
public interface repository  extends  CrudRepository<Users , Integer>  
{



}
