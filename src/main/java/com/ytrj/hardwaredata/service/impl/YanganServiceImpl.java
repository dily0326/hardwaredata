package com.ytrj.hardwaredata.service.impl;

import com.ytrj.hardwaredata.dao.YanganInfoDAO;
import com.ytrj.hardwaredata.entity.YanganInfo;
import com.ytrj.hardwaredata.entity.YanganInfoExample;
import com.ytrj.hardwaredata.service.Server;
import com.ytrj.hardwaredata.service.YanganService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Ivan
 * @description : 烟感数据处理服务实现类
 * @date : 2019/9/4
 */
@Service
public class YanganServiceImpl implements YanganService {

    static final Logger logger = LoggerFactory.getLogger(Server.class);

    @Autowired
    YanganInfoDAO yanganInfoDAO;

    /**
     * 数据存在则更新 不存在则插入
     * @param yanganInfo
     */
    @Override
    public void insertOrUpdate(YanganInfo yanganInfo) {
        YanganInfoExample yanganInfoExample = new YanganInfoExample();
        yanganInfoExample.createCriteria().andDeviceIdEqualTo(yanganInfo.getDeviceid());
        List<YanganInfo> yanganInfoList = yanganInfoDAO.selectByExample(yanganInfoExample);
        yanganInfoExample.clear();

        if (yanganInfoList.isEmpty()) {
            yanganInfoDAO.insert(yanganInfo);
        } else {
            for (int i = 0; i < yanganInfoList.size(); i++) {
                yanganInfo.setId(yanganInfoList.get(i).getId());
                yanganInfoDAO.updateByPrimaryKey(yanganInfo);
                yanganInfoExample.clear();
            }
        }
    }
}
