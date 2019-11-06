package services;

import entities.User;

import java.util.List;

public interface UserService extends AbstractService{
    User getUserByEmail(String email);
}
