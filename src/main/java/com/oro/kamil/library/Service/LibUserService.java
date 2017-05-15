package com.oro.kamil.library.Service;

import com.oro.kamil.library.Dao.LibUserDAO;
import com.oro.kamil.library.Entity.LibUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kamil on 2017-05-01.
 */
@Service
public class LibUserService {

    @Autowired
    private LibUserDAO libUserDAO;

    public List<LibUser> getAllUsers() {
        List<LibUser> users = new ArrayList<>();
        libUserDAO.findAll().forEach(users::add);
        return users;
    }

    public LibUser getById(Integer id){
        return libUserDAO.findOne(id);
    }

    public void addUser(LibUser libUser) {
        libUserDAO.save(libUser);
    }

    public void deleteUser(Integer id) {
        libUserDAO.delete(id);
    }
    public void updateUser(LibUser libUser, Integer id) {
        libUserDAO.save(libUser);
    }
}
