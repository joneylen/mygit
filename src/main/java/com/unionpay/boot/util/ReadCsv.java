package com.unionpay.boot.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {


    /**
     * 读取.csv文件
     * @param path 文件路径
     * @return
     */

    public List<String> readCsv(String path) {
        File file = new File(path);
        file.setReadable(true);//设置可读
        file.setWritable(true);//设置可写
        BufferedReader br = null;
        String line = "";
        String everyLine = "";
        List<String> list = new ArrayList<String>();
        try {
            br = new BufferedReader(new FileReader(file));
            while ((line=br.readLine())!=null){
                everyLine = line;
                list.add(everyLine);
                System.out.println(everyLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}
