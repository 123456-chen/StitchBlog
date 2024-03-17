package com.stitch.commons.utils;

/**
 * @author:Stitch Chen
 * @create: 2023-09-17 17:23
 * @Description: 参数检查
 */
public class TypeChecker {

    public static boolean isEmpty(String value){
        System.out.println("value:"+value);
        return value==null && value.isEmpty();
    }
}
