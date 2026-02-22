package org.example.employee.controller;

import org.example.employee.model.Employee;
import org.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(path = "/getemployee/{id}")
    public Employee getEmployee(@PathVariable int id)
    {
        Employee employee = new Employee();
        employee = service.getEmployeeById(id);
        return employee;
    }
}
