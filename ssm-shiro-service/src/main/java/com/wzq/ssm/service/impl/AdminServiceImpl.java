package com.wzq.ssm.service.impl;

import com.wzq.ssm.dao.AdminDao;
import com.wzq.ssm.model.Admin;
import com.wzq.ssm.service.AdminService;
import com.wzq.ssm.service.shiro.IRoleService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
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
        //加密密码
        String md5 = "MD5";
        Object source = admin.getPassword();
        Object salt = ByteSource.Util.bytes(admin.getName());
        int hash = 1024;
        Object hashedCreds  = new SimpleHash(md5,source,salt,hash);

        //将对象类型密码转换为字符串
        String password = String.valueOf(hashedCreds);

        admin.setPassword(password);
        //更新密码
        int connt = adminDao.updatePassword(admin);
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

    @Override
    public String register(Admin admin) {
        Admin isEmpty = adminDao.findNameAndEmail(admin);
        if (null==isEmpty){
            return "ok";
        }
        return "no";
    }

    @Override
    public int addUser(Admin admin) {
        //对密码进行加密MD5
        //加密密码
        String md5 = "MD5";
        Object source = admin.getPassword();
        Object salt = ByteSource.Util.bytes(admin.getName());
        int hash = 1024;
        Object hashedCreds  = new SimpleHash(md5,source,salt,hash);

        //将对象类型密码转换为字符串
        String password = String.valueOf(hashedCreds);

        admin.setPassword(password);

        int count = adminDao.addUser(admin);
        return count;
    }


}
