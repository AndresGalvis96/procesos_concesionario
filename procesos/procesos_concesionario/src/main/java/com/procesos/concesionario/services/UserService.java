package com.procesos.concesionario.services;

import com.procesos.concesionario.models.User;
import com.procesos.concesionario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User getUser(Long id);
    Boolean createUser(User user);
    List<User> allUsers();
    Boolean updateUser(Long id, User user);
    }
}
