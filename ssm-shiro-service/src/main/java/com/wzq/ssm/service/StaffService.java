package com.wzq.ssm.service;

import com.wzq.ssm.model.Staff;

public interface StaffService<T> extends RootService<T> {

    int  addStaff(Staff staff);
}
