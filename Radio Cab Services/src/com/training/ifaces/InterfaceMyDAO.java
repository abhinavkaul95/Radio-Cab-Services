package com.training.ifaces;

import java.util.List;

public interface InterfaceMyDAO<T> {
public int add(T t);
public int update(String email, String name, String password, String telephone, String city);
public T find(String email);
public int delete(String email);
public List<T> findAll();
public String findPasswordForEmail(String email);
public void close();
}
