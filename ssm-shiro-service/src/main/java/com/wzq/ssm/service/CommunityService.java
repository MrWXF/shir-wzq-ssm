package com.wzq.ssm.service;



import com.wzq.ssm.model.CommunityInfo;

import java.util.List;
import java.util.Map;

public interface CommunityService<T> extends RootService<T> {

    List<T> findAll(Integer page,Integer size);

    List<T> likeFind(String str);

    Map<Object,Object> groupFind(String name);
}
