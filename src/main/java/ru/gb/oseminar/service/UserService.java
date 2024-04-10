package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

//Interface Segregation Principle
//(Принцип разделения интерфейсов)
public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
