package com.pairlearning.expensetracker.services;

import com.pairlearning.expensetracker.domain.User;
import com.pairlearning.expensetracker.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(int id,String firstName, String lastName, String email, String password) throws EtAuthException;

}
