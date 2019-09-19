package com.wzq.ssm.service;

import com.wzq.ssm.model.Admin;

import java.util.List;

public interface AdminService<T> extends RootService<T>{

    Admin lonin(String name);

}
