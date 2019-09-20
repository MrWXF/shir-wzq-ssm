package com.wzq.ssm.service.impl;

import com.wzq.ssm.dao.CommunityInfoDao;
import com.wzq.ssm.model.CommunityInfo;
import com.wzq.ssm.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommunityServiceImpl implements CommunityService<CommunityInfo> {

    @Autowired
    private CommunityInfoDao communityInfoDao;

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

    /**
     * 关键字 查询有关的数据
     * @param str 关键字符串
     * @return
     */
    @Override
    public List<CommunityInfo> likeFind(String str) {
        List<CommunityInfo> communityInfos = communityInfoDao.likeFind(str);
        return communityInfos;
    }

    @Override
    public Map<Object, Object> groupFind(String name) {
        Map<Object, Object> maps = communityInfoDao.groupFind(name);
        return maps;
    }
}
