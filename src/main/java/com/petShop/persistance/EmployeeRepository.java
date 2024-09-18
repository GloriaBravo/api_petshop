package com.petShop.persistance;

import com.petShop.persistance.crud.EmployeeCrudRepository;
import com.petShop.persistance.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {

    private final EmployeeCrudRepository employeeCrudRepository;

    @Autowired
    public EmployeeRepository(EmployeeCrudRepository employeeCrudRepository) {
        this.employeeCrudRepository = employeeCrudRepository;
    }

    public List<Employee> getAll() {
        return (List<Employee>) employeeCrudRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeCrudRepository.save(employee);
    }

    public void delete(int id) {
        employeeCrudRepository.deleteById(id);
    }

    public boolean existsEmployee(int id) {
        return employeeCrudRepository.existsById(id);
    }

    public long countAll() {
        return employeeCrudRepository.count();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employeeCrudRepository.findById(id);
    }

    public void actualizarEmpleado(int id, String nombre, String cargo, double salario) {
        // Lógica para actualizar la información de un empleado
    }
}
