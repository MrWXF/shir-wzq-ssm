package com.wzq.ssm.service;

import com.wzq.ssm.model.Admin;

import java.util.List;

public interface AdminService<Admin> extends RootService<Admin>{

    Admin lonin(String name);

    String register(Admin admin);

    int  addUser(Admin admin);

}
