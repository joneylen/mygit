package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.OriginTravelData;
import com.unionpay.boot.pojo.OriginTravelDataExample;
import com.unionpay.boot.pojo.OriginTravelDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginTravelDataMapper {
    int countByExample(OriginTravelDataExample example);

    int deleteByExample(OriginTravelDataExample example);

    int deleteByPrimaryKey(OriginTravelDataKey key);

    int insert(OriginTravelData record);

    int insertSelective(OriginTravelData record);

    List<OriginTravelData> selectByExample(OriginTravelDataExample example);

    OriginTravelData selectByPrimaryKey(OriginTravelDataKey key);

    int updateByExampleSelective(@Param("record") OriginTravelData record, @Param("example") OriginTravelDataExample example);

    int updateByExample(@Param("record") OriginTravelData record, @Param("example") OriginTravelDataExample example);

    int updateByPrimaryKeySelective(OriginTravelData record);

    int updateByPrimaryKey(OriginTravelData record);
}