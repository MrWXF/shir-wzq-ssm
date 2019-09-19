package com.wzq.ssm.service.impl;

import com.wzq.ssm.dao.AdminDao;
import com.wzq.ssm.model.Admin;
import com.wzq.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService<Admin> {
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> findAll() {
        List<Admin> admins = adminDao.findAll();
        return admins;
    }

    @Override
    public int update(Admin Admin) {
        int connt = adminDao.update(Admin);
        return connt;
    }

    @Override
    public int sava(Admin admin) {
        int connt = adminDao.sava(admin);
        return connt;
    }

    @Override
    public int delete(Integer id) {

        int delconnt = adminDao.delete(id);
        return delconnt;
    }


    @Override
    public Admin lonin(String name) {

        Admin admin = adminDao.login(name);

        return admin;
    }
}
