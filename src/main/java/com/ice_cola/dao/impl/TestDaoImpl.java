package com.ice_cola.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ice_cola.dao.ITestDao;
import com.ice_cola.dao.mapper.TestMapper;
import com.ice_cola.pojo.po.TestPO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ice_cola
 */
@Repository
public class TestDaoImpl implements ITestDao {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<TestPO> selectAll() {
        LambdaQueryWrapper<TestPO> queryWrapper = new LambdaQueryWrapper<>();
        return testMapper.selectList(queryWrapper);
    }
}
