package com.example.jsfcrud.converters;

import com.example.jsfcrud.models.User;
import com.example.jsfcrud.repositories.UserRepository;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@FacesConverter(value = "usersConverter", managed = true)
public class UsersConverter implements Converter {

    @Inject
    private UserRepository userService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value != null ? userService.find(value) : null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value != null ? String.valueOf(((User) value).getId()) : null;
    }

}
