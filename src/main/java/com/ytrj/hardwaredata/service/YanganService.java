package com.ytrj.hardwaredata.service;

import com.ytrj.hardwaredata.entity.YanganInfo;

/**
* @description : 烟感数据处理服务
* @author : Ivan
* @date : 2019/9/4
*/ 
public interface YanganService {
    void insertOrUpdate(YanganInfo yanganInfo);
}
