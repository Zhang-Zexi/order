package com.imooc.order.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成的唯一主键
     * 格式：时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        //随机生成一个数，再让它加上6位
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
