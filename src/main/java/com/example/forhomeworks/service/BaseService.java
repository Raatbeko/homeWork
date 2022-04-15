package com.example.forhomeworks.service;

import java.util.List;

public interface BaseService<T> {
    T save(T t) throws Exception;

    List<T> getAll();

    T findById(Long id);

}
