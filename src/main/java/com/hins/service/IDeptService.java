package com.hins.service;

import com.hins.common.service.IBaseService;
import com.hins.entity.Dept;

import java.util.Set;

/**
 * @author: qixuan.chen
 * @Date: 2018/11/15 14:24
 * @describe：
 * @version: 1.0
 */

public interface IDeptService extends IBaseService<Dept, Integer> {

    // 以树节点展示
    Set<Dept> findAllTree();

}
