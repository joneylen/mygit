package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.TravelAfterAi;
import com.unionpay.boot.pojo.TravelAfterAiExample;
import com.unionpay.boot.pojo.TravelAfterAiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelAfterAiMapper {
    int countByExample(TravelAfterAiExample example);

    int deleteByExample(TravelAfterAiExample example);

    int deleteByPrimaryKey(TravelAfterAiKey key);

    int insert(TravelAfterAi record);

    int insertSelective(TravelAfterAi record);

    List<TravelAfterAi> selectByExample(TravelAfterAiExample example);

    TravelAfterAi selectByPrimaryKey(TravelAfterAiKey key);

    int updateByExampleSelective(@Param("record") TravelAfterAi record, @Param("example") TravelAfterAiExample example);

    int updateByExample(@Param("record") TravelAfterAi record, @Param("example") TravelAfterAiExample example);

    int updateByPrimaryKeySelective(TravelAfterAi record);

    int updateByPrimaryKey(TravelAfterAi record);
}