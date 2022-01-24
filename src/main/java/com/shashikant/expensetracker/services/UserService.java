package com.shashikant.expensetracker.services;

import com.shashikant.expensetracker.model.User;
import com.shashikant.expensetracker.entityexceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(int id,String firstName, String lastName, String email, String password) throws EtAuthException;

}
