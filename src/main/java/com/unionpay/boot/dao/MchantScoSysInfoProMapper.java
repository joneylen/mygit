package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.MchantScoSysInfoPro;
import com.unionpay.boot.pojo.MchantScoSysInfoProExample;
import com.unionpay.boot.pojo.MchantScoSysInfoProKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MchantScoSysInfoProMapper {
    int countByExample(MchantScoSysInfoProExample example);

    int deleteByExample(MchantScoSysInfoProExample example);

    int deleteByPrimaryKey(MchantScoSysInfoProKey key);

    int insert(MchantScoSysInfoPro record);

    int insertSelective(MchantScoSysInfoPro record);

    List<MchantScoSysInfoPro> selectByExample(MchantScoSysInfoProExample example);

    MchantScoSysInfoPro selectByPrimaryKey(MchantScoSysInfoProKey key);

    int updateByExampleSelective(@Param("record") MchantScoSysInfoPro record, @Param("example") MchantScoSysInfoProExample example);

    int updateByExample(@Param("record") MchantScoSysInfoPro record, @Param("example") MchantScoSysInfoProExample example);

    int updateByPrimaryKeySelective(MchantScoSysInfoPro record);

    int updateByPrimaryKey(MchantScoSysInfoPro record);
}