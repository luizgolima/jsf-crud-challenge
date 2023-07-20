package com.example.jsfcrud.repositories;

import com.example.jsfcrud.models.User;
import static java.lang.Long.parseLong;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class UserRepository extends ApplicationRepository<User> {

    public UserRepository() {
        super(User.class);
    }

    public User find(String id) {
        return super.find(parseLong(id));
    }

}
