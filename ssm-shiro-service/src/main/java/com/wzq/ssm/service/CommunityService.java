package com.wzq.ssm.service;



import java.util.List;

public interface CommunityService<T> extends RootService<T> {

    List<T> findAll(Integer page,Integer size);
}
