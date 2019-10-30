package com.ytrj.hardwaredata.utils;

import java.util.function.Supplier;

/**
* @description : 对象工具类
* @author : dongye
* @date : 2019/9/23
*/ 
public class ObjectUtils {
    /**
     * 比较两个对象是否相等
     *
     * @param actual
     * @param expected
     * @return
     *         <ul>
     *         <li>若两个对象都为null，则返回true</li>
     *         <li>若两个对象都不为null，且相等，则返回true</li>
     *         <li>否则返回false</li>
     *         </ul>
     */
    public static boolean isEquals(Object actual, Object expected) {
        return actual == null ? expected == null : actual.equals(expected);
    }

    /**
     * long数组转换成Long数组
     *
     * @param source
     * @return
     */
    public static Long[] transformLongArray(long[] source) {
        Long[] destin = new Long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * Long数组转换成long数组
     *
     * @param source
     * @return
     */
    public static long[] transformLongArray(Long[] source) {
        long[] destin = new long[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * int数组转换成Integer数组
     *
     * @param source
     * @return
     */
    public static Integer[] transformIntArray(int[] source) {
        Integer[] destin = new Integer[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * Integer数组转换成int数组
     *
     * @param source
     * @return
     */
    public static int[] transformIntArray(Integer[] source) {
        int[] destin = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destin[i] = source[i];
        }
        return destin;
    }

    /**
     * 如果任何一个对象为空，则返回false
     * @return
     */
    public static boolean isAnyNull(Object... objs){
        boolean result = false;
        for(Object obj : objs){
            if(obj == null){
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean tryThreeTime(Supplier<Boolean> supplier){ //尝试三次，再不行就返回
        int count = 0;
        boolean result = false;
        while (result == false && count < 3){
            try {
                result = supplier.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            count++;
        }
        return result;
    }
}
