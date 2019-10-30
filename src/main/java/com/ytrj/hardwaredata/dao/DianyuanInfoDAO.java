package com.ytrj.hardwaredata.dao;

import com.ytrj.hardwaredata.entity.DianyuanInfo;
import com.ytrj.hardwaredata.entity.DianyuanInfoExample;
import org.springframework.stereotype.Repository;

/**
 * DianyuanInfoDAO继承基类
 */
@Repository
public interface DianyuanInfoDAO extends MyBatisBaseDao<DianyuanInfo, Long, DianyuanInfoExample> {
}