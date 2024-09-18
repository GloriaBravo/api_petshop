package com.petShop.persistance;

import com.petShop.persistance.crud.SalesCrudRepository;
import com.petShop.persistance.entity.Sales;
import com.petShop.persistance.entity.Owner;
import com.petShop.persistance.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class SalesRepository {

    @Autowired
    private SalesCrudRepository salesCrudRepository;

    public List<Sales> getAll() {
        return (List<Sales>) salesCrudRepository.findAll();
    }

    public Sales save(Sales sales) {
        return salesCrudRepository.save(sales);
    }

    public void delete(int id) {
        salesCrudRepository.deleteById(id);
    }

    public boolean existsSales(int id) {
        return salesCrudRepository.existsById(id);
    }

    public long countAll() {
        return salesCrudRepository.count();
    }

    public Optional<Sales> getSalesById(int id) {
        return salesCrudRepository.findById(id);
    }

    // 1. Encontrar ventas por fecha específica
    public List<Sales> findByDate(Date date) {
        return salesCrudRepository.findByDate(date);
    }

    // 2. Encontrar ventas dentro de un rango de fechas
    public List<Sales> findByDateBetween(Date startDate, Date endDate) {
        return salesCrudRepository.findByDateBetween(startDate, endDate);
    }

    // 3. Encontrar ventas con un monto total mayor a un valor dado
    public List<Sales> findByTotalGreaterThan(BigDecimal amount) {
        return salesCrudRepository.findByTotalGreaterThan(amount);
    }

    // 4. Encontrar ventas por cliente
    public List<Sales> findByCliente(Owner cliente) {
        return salesCrudRepository.findByCliente(cliente);
    }
}
