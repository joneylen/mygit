package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.OriginPictureData;
import com.unionpay.boot.pojo.OriginPictureDataExample;
import com.unionpay.boot.pojo.OriginPictureDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginPictureDataMapper {
    int countByExample(OriginPictureDataExample example);

    int deleteByExample(OriginPictureDataExample example);

    int deleteByPrimaryKey(OriginPictureDataKey key);

    int insert(OriginPictureData record);

    int insertSelective(OriginPictureData record);

    List<OriginPictureData> selectByExampleWithBLOBs(OriginPictureDataExample example);

    List<OriginPictureData> selectByExample(OriginPictureDataExample example);

    OriginPictureData selectByPrimaryKey(OriginPictureDataKey key);

    int updateByExampleSelective(@Param("record") OriginPictureData record, @Param("example") OriginPictureDataExample example);

    int updateByExampleWithBLOBs(@Param("record") OriginPictureData record, @Param("example") OriginPictureDataExample example);

    int updateByExample(@Param("record") OriginPictureData record, @Param("example") OriginPictureDataExample example);

    int updateByPrimaryKeySelective(OriginPictureData record);

    int updateByPrimaryKeyWithBLOBs(OriginPictureData record);

    int updateByPrimaryKey(OriginPictureData record);
}