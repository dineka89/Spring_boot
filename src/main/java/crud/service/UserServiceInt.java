package crud.service;

import crud.entity.User;

import java.util.List;

public interface UserServiceInt {

    List<User> listAll();

    void save(User user);

    void delete(Long id);

    User get(Long id);
}
