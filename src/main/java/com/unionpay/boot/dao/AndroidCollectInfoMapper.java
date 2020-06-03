package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.AndroidCollectInfo;
import com.unionpay.boot.pojo.AndroidCollectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidCollectInfoMapper {
    int countByExample(AndroidCollectInfoExample example);

    int deleteByExample(AndroidCollectInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AndroidCollectInfo record);

    int insertSelective(AndroidCollectInfo record);

    List<AndroidCollectInfo> selectByExample(AndroidCollectInfoExample example);

    AndroidCollectInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AndroidCollectInfo record, @Param("example") AndroidCollectInfoExample example);

    int updateByExample(@Param("record") AndroidCollectInfo record, @Param("example") AndroidCollectInfoExample example);

    int updateByPrimaryKeySelective(AndroidCollectInfo record);

    int updateByPrimaryKey(AndroidCollectInfo record);
}