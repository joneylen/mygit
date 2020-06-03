package com.unionpay.boot.service;

import com.unionpay.boot.dao.AndroidCollectInfoMapper;
import com.unionpay.boot.pojo.AndroidCollectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 戴草帽的王子
 * @Date: 2020/3/19 12:57
 * @Version 1.0
 */
@Service
public class AdroidCollectInfoMoreService {
    @Autowired
    AndroidCollectInfoMapper mapper;

    public boolean saveAndroColeeInfo(AndroidCollectInfo androidCollectInfo) {
       return mapper.insert(androidCollectInfo)>0?true:false;
    }
}
