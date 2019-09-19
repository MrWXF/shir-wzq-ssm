package com.wzq.ssm.dao;

import com.wzq.ssm.model.CommunityInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommunityInfoDao {

    @Select("select * from community_info")
    public List<CommunityInfo> findAll();

//"insert into tb_admin(" +
//            "name,password,role) " +
//            "values(" +
//            "#{name},#{password},#{role})"
    @Insert("insert into community_info(tradename,cate,supplierid ,purchtime ,price ) values (" +
            "#{tradename},#{cate},#{supplierid},#{purchtime},#{price})")
    public int sava(CommunityInfo communityInfo);
}
