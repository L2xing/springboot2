package com.ice_cola.dao;

import com.ice_cola.pojo.po.TestPO;

import java.util.List;

/**
 * @author ice_cola
 */
public interface ITestDao {
    List<TestPO> selectAll();
}
