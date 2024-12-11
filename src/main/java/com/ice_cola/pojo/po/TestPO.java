package com.ice_cola.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ice_cola
 */
@Data
@TableName("test")
public class TestPO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String code;

}
