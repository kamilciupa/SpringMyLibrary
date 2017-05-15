package com.oro.kamil.library.Controller;

import com.oro.kamil.library.Entity.LibUser;
import com.oro.kamil.library.Service.LibUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kamil on 2017-05-01.
 */

@RestController
public class LibUserController {

    @Autowired
    private LibUserService libUserService;

    @RequestMapping("/users")
    public List<LibUser> getAllUsers(){
        return libUserService.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public LibUser getUserById(@PathVariable Integer id){return libUserService.getById(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody LibUser libUser){
        libUserService.addUser(libUser);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUserBySurname(@PathVariable Integer id){
        libUserService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody LibUser libUser, @PathVariable Integer id){
        libUserService.updateUser(libUser, id);
    }




}
