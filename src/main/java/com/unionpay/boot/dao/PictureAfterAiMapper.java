package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.PictureAfterAi;
import com.unionpay.boot.pojo.PictureAfterAiExample;
import com.unionpay.boot.pojo.PictureAfterAiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureAfterAiMapper {
    int countByExample(PictureAfterAiExample example);

    int deleteByExample(PictureAfterAiExample example);

    int deleteByPrimaryKey(PictureAfterAiKey key);

    int insert(PictureAfterAi record);

    int insertSelective(PictureAfterAi record);

    List<PictureAfterAi> selectByExample(PictureAfterAiExample example);

    PictureAfterAi selectByPrimaryKey(PictureAfterAiKey key);

    int updateByExampleSelective(@Param("record") PictureAfterAi record, @Param("example") PictureAfterAiExample example);

    int updateByExample(@Param("record") PictureAfterAi record, @Param("example") PictureAfterAiExample example);

    int updateByPrimaryKeySelective(PictureAfterAi record);

    int updateByPrimaryKey(PictureAfterAi record);
}