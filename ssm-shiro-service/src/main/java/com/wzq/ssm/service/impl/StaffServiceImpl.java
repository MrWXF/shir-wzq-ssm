package com.wzq.ssm.service.impl;

import com.wzq.ssm.dao.StaffDao;
import com.wzq.ssm.model.Staff;
import com.wzq.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 员工的逻辑业务
 */
@Service
@Transactional
public class StaffServiceImpl implements StaffService<Staff> {
    @Autowired
    private StaffDao staffDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Staff> findAll() {
        List<Staff> staffs = staffDao.findAll();
        return staffs;
    }

    @Override
    public int update(Staff staff) {
        return 0;
    }

    @Override
    public int sava(Staff staff) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }
}
