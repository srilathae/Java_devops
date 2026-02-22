package org.example.employee.service;



import org.example.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService
{

    //public List<Employee> employeeList = new ArrayList<>();

    public  List<Employee> createEmployees()
    {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();

        employee.setEmpId(1);
        employee.setFirstName("srilatha");
        employee.setLastName("eedula");
        employee.setAge(30);


        Employee employee1 = new Employee();

        employee1.setEmpId(2);
        employee1.setFirstName("Mohan");
        employee1.setLastName("DoddaReddy");
        employee1.setAge(35);


        Employee employee2 = new Employee();

        employee2.setEmpId(3);
        employee2.setFirstName("Mokshit");
        employee2.setLastName("Doddareddy");
        employee2.setAge(10);

        Employee employee3 = new Employee();

        employee3.setEmpId(4);
        employee3.setFirstName("purvik");
        employee3.setLastName("doddareddy");
        employee3.setAge(23);

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        return employeeList;
    }

    public Employee getEmployeeById(int id)
    {
        Employee employee = new Employee();
      List<Employee>  employees= createEmployees();
      for (Employee e:employees)
      {
          if(e.getEmpId()==id)
              employee= e;
      }
return employee;
    }
}
