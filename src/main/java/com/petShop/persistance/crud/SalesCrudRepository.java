package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Owner;
import com.petShop.persistance.entity.Sales;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface SalesCrudRepository extends CrudRepository <Sales, Integer> {
    List<Sales> findByCliente(Owner cliente);

    List<Sales> findByDateBetween(Date startDate, Date endDate);

    List<Sales> findByTotalGreaterThan(BigDecimal amount);

    List<Sales> findByDate(Date date);

}






