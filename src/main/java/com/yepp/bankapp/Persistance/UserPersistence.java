package com.yepp.bankapp.Persistance;

import com.yepp.bankapp.model.Account;
import com.yepp.bankapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPersistence extends JpaRepository<User, Integer> {
    List<User> findAllById(Integer id);

    List<User> findAllByName(String name);

    User save(User user);

    void deleteUserById(Integer id);
}

