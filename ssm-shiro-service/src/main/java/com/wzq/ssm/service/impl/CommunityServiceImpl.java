package com.wzq.ssm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wzq.ssm.dao.CommunityInfoDao;
import com.wzq.ssm.model.CommunityInfo;
import com.wzq.ssm.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommunityServiceImpl implements CommunityService<CommunityInfo> {

    @Autowired
    CommunityInfoDao communityInfoDao;

    /**
     * 查询所有商品
     * @param
     * @return
     */
    @Override
    public List<CommunityInfo> findAll() {
        List<CommunityInfo> comms = communityInfoDao.findAll();


        return comms;
    }

    @Override
    public int update(CommunityInfo communityInfo) {
        return 0;
    }

    @Override
    public int sava(CommunityInfo communityInfo) {

        int num=  communityInfoDao.sava(communityInfo);
        return num;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }


    @Override
    public List<CommunityInfo> findAll(Integer page, Integer size) {
        //    开启分页    pageNum是页码值 pageSize是每页显示条数（）必须写在真正查询语句的上一句

        List<CommunityInfo> comms = communityInfoDao.findAll();
        return comms;
    }
}
