 package com.example.excel.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.excel.model.users;


@Repository
public interface respository  extends  CrudRepository<users , Integer>  
{



}
