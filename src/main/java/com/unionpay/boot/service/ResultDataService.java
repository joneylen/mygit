package com.unionpay.boot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unionpay.boot.Entity.AllMerchantsInfoResponseData;
import com.unionpay.boot.Entity.TransactionRecordResponseData;
import com.unionpay.boot.Entity.TransactionStatisticsData;
import com.unionpay.boot.dao.AllAfterAiInforMapper;
import com.unionpay.boot.dao.AllAfterAiResultDataMapper;
import com.unionpay.boot.pojo.AllAfterAiResultData;
import com.unionpay.boot.pojo.AllAfterAiResultDataExample;
import com.unionpay.boot.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 戴草帽的王子
 * @Date: 2020/3/14 15:15
 * @Version 1.0
 */
@Service
public class ResultDataService {

    @Autowired
    private AllAfterAiResultDataMapper allAfterAiResultDataMapper;

    @Autowired
    private AllAfterAiInforMapper allAfterAiInforMapper;


    /**
     * 查询综合得分
     *
     * @param device_id
     * @param time
     * @return
     */
    public AllAfterAiResultData queryScores(String device_id, String time) {

        AllAfterAiResultDataExample example = new AllAfterAiResultDataExample();
        AllAfterAiResultDataExample.Criteria criteria = example.createCriteria();
        criteria.andDeviceIdEqualTo(device_id).andResultTimeEqualTo(PropertyUtil.formatFromYYYYMMDD(time));
        List<AllAfterAiResultData> list = allAfterAiResultDataMapper.selectByExample(example);

        if (!list.isEmpty()) {
            AllAfterAiResultData data = list.get(0);
            return data;
        } else {
            throw new RuntimeException();
        }
    }

    /**
     * 大屏展示所有商户信息
     *
     * @return
     */
    public AllMerchantsInfoResponseData mwgetAllMerchantsInfo() {

        AllMerchantsInfoResponseData data = allAfterAiInforMapper.selectByPosAndTravel();
        if (!StringUtils.isEmpty(data)){
            return  data;
        }else{
            throw  new  RuntimeException();
        }

    }

    /**
     * 前端获取所有的历史交易信息统计趋势接口
     *
     * @param startTime
     * @param endTime
     * @param map
     * @return
     */
    public List<TransactionStatisticsData> transactionStatisticsServices(Map<String, String> map) {
        List<TransactionStatisticsData> listData=allAfterAiInforMapper.selectTransactionStatisticsMapper(map);

        if (!StringUtils.isEmpty(listData)){
            return  listData;
        }else{
            throw  new  RuntimeException();
        }
    }

    /**
     * 获取交易记录
     *
     * @param pageNum
     * @param pageSize
     * @param startTime
     * @param endTime
     * @return
     */
    public PageInfo transactionRecordServices(Integer pageNum, Integer pageSize, Map<String, String> map) {

        //设置页数,一页显示数(默认10条)
        PageHelper.startPage(pageNum, pageSize);
        //排序规则
        PageHelper.orderBy("id desc");
        //查询
        List<TransactionRecordResponseData> list = allAfterAiInforMapper.selectByAllAfterAiResultDataPageInfo(map);

        PageInfo<TransactionRecordResponseData> pageInfo = new PageInfo<>(list);
        if (!StringUtils.isEmpty(pageInfo)) {
            return pageInfo;
        } else {
            throw  new  RuntimeException();
        }

    }
}
