package com.serguipe.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.serguipe.domain.Employee;

@Service
public class EmployeeService {
	
	public List<Employee> getAllEmployee() {
		   List<Employee> listEmployee = new ArrayList<>();
		   listEmployee.add(new Employee(1, "Sergio", "Zaragoza"));
		   listEmployee.add(new Employee(2, "Paco", "Teruel"));
		   listEmployee.add(new Employee(3, "Fernando", "Groenlandia"));
		   return listEmployee;
	   }
}
