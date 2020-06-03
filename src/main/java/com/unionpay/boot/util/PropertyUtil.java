package com.unionpay.boot.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class PropertyUtil {
    private static final Logger log = LoggerFactory.getLogger(PropertyUtil.class);
    private static Properties properties;

    public static String getProperty(String key) {
        if (properties == null) {//双重锁模式  
            synchronized (PropertyUtil.class) {
                if (properties == null) {
                    properties = new Properties();
                }
            }
            try {
                InputStream stream = new FileInputStream(Constants.CONFIG_FILE_PATH);
                properties.load(stream);
                stream.close();
            } catch (FileNotFoundException e) {
                log.error(e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                log.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }

    /**
     * 根据String返回Timestamp
     *  Created on 2014-6-6
     * @param value
     * @return Timestamp
     */
    public static Timestamp formatFromYYYYMMDD(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = null;
        try {
            date = sdf.parse(value);
        } catch (ParseException e) {
            return null;
        }
        return new Timestamp(date.getTime());
    }
}
