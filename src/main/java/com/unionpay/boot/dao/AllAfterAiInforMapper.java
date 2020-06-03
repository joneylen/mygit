package com.unionpay.boot.dao;


import com.unionpay.boot.Entity.AllMerchantsInfoResponseData;
import com.unionpay.boot.Entity.TransactionRecordResponseData;
import com.unionpay.boot.Entity.TransactionStatisticsData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface AllAfterAiInforMapper {


    AllMerchantsInfoResponseData selectByPosAndTravel();

    List<TransactionRecordResponseData> selectByAllAfterAiResultDataPageInfo(Map<String, String> map);

    List<TransactionStatisticsData> selectTransactionStatisticsMapper(Map<String, String> map);
}
