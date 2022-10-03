package crud.service;


import crud.entity.User;
import crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements UserServiceInt {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    @Override
    public void save(User user) {
        repo.save(user);
    }
    @Override
    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }
    @Override
    public User get(Long id) {
        return repo.findById(id).get();
    }
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}