package com.unionpay.boot.dao;

import com.unionpay.boot.pojo.PosUploadInfo;
import com.unionpay.boot.pojo.PosUploadInfoExample;
import com.unionpay.boot.pojo.PosUploadInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface posUploadInfoMapper {
    int countByExample(PosUploadInfoExample example);

    int deleteByExample(PosUploadInfoExample example);

    int deleteByPrimaryKey(PosUploadInfoKey key);

    int insert(PosUploadInfo record);

    int insertSelective(PosUploadInfo record);

    List<PosUploadInfo> selectByExample(PosUploadInfoExample example);

    PosUploadInfo selectByPrimaryKey(PosUploadInfoKey key);

    int updateByExampleSelective(@Param("record") PosUploadInfo record, @Param("example") PosUploadInfoExample example);

    int updateByExample(@Param("record") PosUploadInfo record, @Param("example") PosUploadInfoExample example);

    int updateByPrimaryKeySelective(PosUploadInfo record);

    int updateByPrimaryKey(PosUploadInfo record);
}