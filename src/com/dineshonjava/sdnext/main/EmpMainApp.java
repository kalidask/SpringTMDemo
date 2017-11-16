package com.dineshonjava.sdnext.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dineshonjava.sdnext.dao.EmpDao;
import com.dineshonjava.sdnext.domain.Employee;

public class EmpMainApp {

 public static void main(String[] args) {
  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  EmpDao empDao = (EmpDao) context.getBean("employeeDaoImpl");
  
  System.out.println("------Records Creation--------" );
  empDao.create("Raaz", 25, 50000l);
   
  System.out.println("------Listing Multiple Records--------" );
  
List<Employee> employees = empDao.listEmployees();
  for (Employee employee : employees) {
          System.out.print("employee list:---------"+employee);
     }
  
  
 }
}
