package com.shashikant.expensetracker.repositories;

import com.shashikant.expensetracker.model.Transaction;
import com.shashikant.expensetracker.entityexceptions.EtBadRequestException;
import com.shashikant.expensetracker.entityexceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

}
