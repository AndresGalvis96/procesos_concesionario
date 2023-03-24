package com.procesos.concesionario.controllers;

import com.procesos.concesionario.models.User;
import com.procesos.concesionario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping(value = "/user/{id}")
    public ResponseEntity getById(@PathVariable(name = "id") Long id) {
        Map message = new HashMap<>();
        try {
            response.put("massage", "Se encontró el usuario ");
            response.put("data", userServiceImp.getUserBYId(id));
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("massage", "No se encontró el usuario ");
            response.put("data", e.getMessage);
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        }

    }
    public ResponseEntity createUser(@RequestBody User user){
        Map message = new HashMap<>();
        try{
            response.put("massage", "Se guardó el usuario ");
            response.put("data",userServiceImp.createUser(user) );
            return new ResponseEntity(response, HttpStatus.CREATED) ;
        }catch (Exception e){
        response.put("massage", "No se guardó el usuario ");
        response.put("data", e.getMessage );
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }
    }
    public ResponseEntity getAllUsers {
        Map message = new HashMap<>();
        try {
            response.put("massage", "Se encontraron los usuarios ");
            response.put("data", userServiceImp.findAll());
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("massage", "No se encontró ningún usuario ");
            response.put("data", e.getMessage);
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping(value = "/user")
    public Boolean saveUser(@RequestBody User user){
        return userServiceImp.createUser(user);
    }
}
