package com.ice_cola.service.impl;

import com.ice_cola.dao.ITestDao;
import com.ice_cola.pojo.po.TestPO;
import com.ice_cola.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ice_cola
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private ITestDao testDao;

    @Override
    public List<TestPO> selectAll() {
        return testDao.selectAll();
    }
}
