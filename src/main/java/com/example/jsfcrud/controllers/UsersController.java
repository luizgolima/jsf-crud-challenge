package com.example.jsfcrud.controllers;

import static com.example.jsfcrud.helpers.UsersHelper.userPath;
import static com.example.jsfcrud.helpers.UsersHelper.usersPath;
import com.example.jsfcrud.models.User;
import com.example.jsfcrud.repositories.UserRepository;
import java.io.Serializable;
import java.util.List;
import static javax.faces.application.FacesMessage.SEVERITY_INFO;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named @ViewScoped
public class UsersController extends ApplicationController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UserRepository userRepository;

    private List<User> users;

    private User user;

    public void index() {
        users = userRepository.all();
    }

    public void new_() {
        user = new User();
    }

    public String create() {
        userRepository.save(user);
        return redirectTo(userPath(user), SEVERITY_INFO, "User was successfully created.");
    }

    public String update() {
        userRepository.save(user);
        return redirectTo(userPath(user), SEVERITY_INFO, "User was successfully updated.");
    }

    public String destroy() {
        userRepository.destroy(user);
        return redirectTo(usersPath(), SEVERITY_INFO, "User was successfully destroyed.");
    }

    public void loadUser() {
        user = userRepository.find(getParams().get("id"));
    }

    //<editor-fold defaultstate="collapsed" desc="Get/Set">
    public List<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>
}
