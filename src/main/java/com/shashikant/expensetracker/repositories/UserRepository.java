package com.shashikant.expensetracker.repositories;

import com.shashikant.expensetracker.model.User;
import com.shashikant.expensetracker.entityexceptions.EtAuthException;
import org.springframework.data.repository.CrudRepository;

/**
 * created a public interface UserRepository
 */
public interface UserRepository extends CrudRepository<User,Integer> {
    User findByEmail(String email);

    //Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

   // User findById(Integer userId);

}
