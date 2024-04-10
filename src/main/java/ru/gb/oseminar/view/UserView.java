package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;
//Interface Segregation Principle
//(Принцип разделения интерфейсов)
public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
