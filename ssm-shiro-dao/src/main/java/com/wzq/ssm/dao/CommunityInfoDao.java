package com.wzq.ssm.dao;

import com.wzq.ssm.model.CommunityInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;

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


    /**
     * 模糊查询数据
     * results注解 id 主键， property 实体对应的名称， column数据库对应的名称， javaType java类型 ，jdbcType 数据库类型
     */

    @Select("select * from community_info where tradename like #{str} or cate LIKE #{str}")
    @Results(
            @Result( id = true,property = "id", column = "id",javaType = Integer.class)
    )
    List<CommunityInfo> likeFind(String str);


    /**
     * 分组查询
     * name 条件
     */
    @Select("select name, COUNT(*) from tb_admin GROUP BY #{name}")
    public Map<Object,Object> groupFind(String name);


}
