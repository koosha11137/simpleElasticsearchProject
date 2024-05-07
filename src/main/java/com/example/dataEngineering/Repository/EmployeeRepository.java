package com.example.dataEngineering.Repository;

import com.example.dataEngineering.Entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface  EmployeeRepository  extends ElasticsearchRepository<Employee, String> {

}
