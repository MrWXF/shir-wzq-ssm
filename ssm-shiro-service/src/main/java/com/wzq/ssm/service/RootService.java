package com.wzq.ssm.service;

import java.util.List;

public interface RootService<T> {
    List<T> findAll();

    int update(T t);

    int sava(T t);

    int delete(Integer id);
}
