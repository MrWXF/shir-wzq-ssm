package com.wzq.ssm.service.impl;

import com.wzq.ssm.dao.RoleDao;
import com.wzq.ssm.model.Role;
import com.wzq.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService<Role> {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public int update(Role role) {
        return 0;
    }

    @Override
    public int sava(Role role) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    /**
     * 根据Admin的role 来查询角色的信息
     * @param role  Admin的外键关联id
     * @return
     */
    @Override
    public String roleName(Integer role) {
        String roleName = roleDao.roleName(role);
        return roleName;
    }
}
