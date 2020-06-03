package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.MchantScoSysInfo;
import com.unionpay.boot.pojo.MchantScoSysInfoExample;
import com.unionpay.boot.pojo.MchantScoSysInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MchantScoSysInfoMapper {
    int countByExample(MchantScoSysInfoExample example);

    int deleteByExample(MchantScoSysInfoExample example);

    int deleteByPrimaryKey(MchantScoSysInfoKey key);

    int insert(MchantScoSysInfo record);

    int insertSelective(MchantScoSysInfo record);

    List<MchantScoSysInfo> selectByExample(MchantScoSysInfoExample example);

    MchantScoSysInfo selectByPrimaryKey(MchantScoSysInfoKey key);

    int updateByExampleSelective(@Param("record") MchantScoSysInfo record, @Param("example") MchantScoSysInfoExample example);

    int updateByExample(@Param("record") MchantScoSysInfo record, @Param("example") MchantScoSysInfoExample example);

    int updateByPrimaryKeySelective(MchantScoSysInfo record);

    int updateByPrimaryKey(MchantScoSysInfo record);
}