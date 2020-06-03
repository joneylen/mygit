package com.unionpay.boot.controller;


import com.github.pagehelper.PageInfo;
import com.unionpay.boot.Entity.AllMerchantsInfoResponseData;
import com.unionpay.boot.Entity.TransactionRecordResponseData;
import com.unionpay.boot.Entity.TransactionStatisticsData;
import com.unionpay.boot.common.AppResponse;
import com.unionpay.boot.pojo.AndroidCollectInfo;
import com.unionpay.boot.pojo.OriginTravelData;
import com.unionpay.boot.pojo.PosUploadInfo;
import com.unionpay.boot.service.AdroidCollectInfoMoreService;
import com.unionpay.boot.service.QueryPhython;
import com.unionpay.boot.service.ResultDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 戴草帽的王子
 * @Date: 2020/3/13 18:04
 * @Version 1.0
 */
@Slf4j
@RestController
public class ResultController {
    @Autowired
    ResultDataService resultDataService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    QueryPhython queryPhython;
    @Autowired
    AdroidCollectInfoMoreService adroidCollectInfoMoreService;

//查询综合得分和上传pos接口
    @PostMapping("/query")
    @ResponseBody
    public AppResponse queryScores(
            @RequestParam("deviceId") String deviceId,
            @RequestParam("time") String time,
             PosUploadInfo info
    ) {
        log.info("查询综合得分并获取收集pos上传信息接口");


        return AppResponse.ok();

    }
//Android上传轨迹请求计算接口
    @PostMapping(value = "/TravelUpload/{deviceId}")
    @ResponseBody
    public AppResponse androidUploadTravel(
            @PathVariable String deviceId,
            @RequestBody List<OriginTravelData> list
            ) {
        log.info("安卓上传轨迹接口");
        for (OriginTravelData data : list) {
            System.out.println(data.getDeviceId());
            System.out.println(data.getRequestTime());
        }



        String travelKey = deviceId + "_travel";
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(travelKey, "a",500, TimeUnit.SECONDS);

        String s = null;
        //判断
        if (ifOrNotAllInformationOnRedis(deviceId)) {
            s = handleAllForScores(deviceId);

            return AppResponse.ok().data("data", "轨迹上传接口计算得分" + s);
        }
        return AppResponse.ok();
    }
//Android上传图片请求计算得分接口
    @PostMapping(value = "/PictureUpload/{deviceId}")
    @ResponseBody
    public AppResponse androidUploadPicture(@PathVariable String deviceId,
                                            @RequestParam("file") MultipartFile[] files) throws Exception {
        log.info("安卓上传图片接口");
        String redisKey = deviceId + "_picture";
        for (MultipartFile file : files) {
            byte[] bytes = file.getBytes();
            System.out.println(bytes);
        }
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(redisKey, "b");

        String s = null;
        //判断
        if (ifOrNotAllInformationOnRedis(deviceId)) {
            s = handleAllForScores(deviceId);

            return AppResponse.ok().data("data", "图片上传接口计算得分" + s);
        }
        return AppResponse.ok();


    }

//Android上传采集信息接口
    @ResponseBody
    @PostMapping(value = "/androidcollectInfoMore")
    public  AppResponse androidCollectInfoMore(@RequestBody AndroidCollectInfo androidCollectInfo ){
        boolean b = adroidCollectInfoMoreService.saveAndroColeeInfo(androidCollectInfo);
        if (b) {

            return  AppResponse.ok();
        }
        return  AppResponse.error();
    }
//前端获取所有的商户信息大屏展示接口
@PostMapping(value = "/getAllMerchantsInfo")
public AppResponse mwgetAllMerchantsInfo(){
    try {
        log.info("前端获取所有的商户信息大屏展示接口");
        AllMerchantsInfoResponseData data = resultDataService.mwgetAllMerchantsInfo();

        if (StringUtils.isEmpty(data)) {
            return AppResponse.error().success(false).code(201).message("请求成功但没有数据");
        }

        return AppResponse.ok().data("content", data);
    } catch (Exception e) {
        e.printStackTrace();
        return AppResponse.error().success(false).code(500).message("服务器异常");
    }

}
//前端获取所有的历史交易信息统计趋势接口
@PostMapping(value = "/getTransactionStatistics")
public AppResponse getTransactionStatistics(String startTime,String endTime){

    try {
        log.info("前端获取所有的历史交易信息统计趋势接口");
        if (StringUtils.isEmpty(startTime) || StringUtils.isEmpty(endTime)) {
            log.error("参数为空");
            return AppResponse.error().success(false).code(400).message("请求参数错误");
        }
        Map<String, String> map = new HashMap<>();
        map.put("startTime", startTime);
        map.put("endTime", endTime);


        List<TransactionStatisticsData> tranNumList = resultDataService.transactionStatisticsServices(map);

        if (StringUtils.isEmpty(tranNumList)) {
            return AppResponse.error().success(false).code(201).message("请求成功但没有数据");
        }
        return AppResponse.ok().data("contene", tranNumList);
    } catch (Exception e) {
        e.printStackTrace();
        return AppResponse.error().success(false).code(500).message("服务器异常");
    }
}

//获取交易记录
@PostMapping(value = "/getTransactionRecord")
public AppResponse getTransactionRecord(@RequestParam(value = "pageNum",defaultValue="1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue="2")Integer pageSize,String startTime,String endTime){

    try {
        log.info("获取交易记录");
        if ( StringUtils.isEmpty(startTime)
                || StringUtils.isEmpty(endTime)) {
            return AppResponse.error().success(false).code(400).message("请求参数错误");
        }
        Map<String, String> map = new HashMap<>();
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        PageInfo<AllMerchantsInfoResponseData> data=resultDataService.transactionRecordServices(pageNum,pageSize,map);

        if (StringUtils.isEmpty(data)){
            return AppResponse.error().success(false).code(201).message("请求成功但没有数据");
        }

        return AppResponse.ok().data("content", data);
    } catch (Exception e) {
        e.printStackTrace();
        return AppResponse.error().success(false).code(500).message("服务器异常");
    }
}




    //用作redis中计算综合评分方法
    public String handleAllForScores(String deviceId) {
        String pictureKey = deviceId + "_picture";
        String travelKey = deviceId + "_travel";
        String phoneposKey = deviceId + "_phonepos";
        String s1 = stringRedisTemplate.opsForValue().get(pictureKey);
        String s2 = stringRedisTemplate.opsForValue().get(travelKey);
        String s3 = stringRedisTemplate.opsForValue().get(phoneposKey);
        //需要处理计算逻辑

        //删除redis中的有效键

        stringRedisTemplate.delete(pictureKey);
        stringRedisTemplate.delete(travelKey);
        stringRedisTemplate.delete(phoneposKey);

        return "10";
    }

    //用作判断是否全量数据
    public boolean ifOrNotAllInformationOnRedis(String deviceId) {
        String pictureKey = deviceId + "_picture";
        String travelKey = deviceId + "_travel";
        String phoneposKey = deviceId + "_phonepos";
        return (stringRedisTemplate.hasKey(pictureKey) && stringRedisTemplate.hasKey(travelKey) && stringRedisTemplate.hasKey(phoneposKey));
    }

}









