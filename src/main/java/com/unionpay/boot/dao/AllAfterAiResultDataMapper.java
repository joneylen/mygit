package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.AllAfterAiResultData;
import com.unionpay.boot.pojo.AllAfterAiResultDataExample;
import com.unionpay.boot.pojo.AllAfterAiResultDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AllAfterAiResultDataMapper {
    int countByExample(AllAfterAiResultDataExample example);

    int deleteByExample(AllAfterAiResultDataExample example);

    int deleteByPrimaryKey(AllAfterAiResultDataKey key);

    int insert(AllAfterAiResultData record);

    int insertSelective(AllAfterAiResultData record);

    List<AllAfterAiResultData> selectByExample(AllAfterAiResultDataExample example);

    AllAfterAiResultData selectByPrimaryKey(AllAfterAiResultDataKey key);

    int updateByExampleSelective(@Param("record") AllAfterAiResultData record, @Param("example") AllAfterAiResultDataExample example);

    int updateByExample(@Param("record") AllAfterAiResultData record, @Param("example") AllAfterAiResultDataExample example);

    int updateByPrimaryKeySelective(AllAfterAiResultData record);

    int updateByPrimaryKey(AllAfterAiResultData record);
}