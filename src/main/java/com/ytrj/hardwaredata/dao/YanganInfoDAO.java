package com.ytrj.hardwaredata.dao;

import com.ytrj.hardwaredata.entity.YanganInfo;
import com.ytrj.hardwaredata.entity.YanganInfoExample;
import org.springframework.stereotype.Repository;

/**
 * YanganInfoDAO继承基类
 */
@Repository
public interface YanganInfoDAO extends MyBatisBaseDao<YanganInfo, Long, YanganInfoExample> {
}